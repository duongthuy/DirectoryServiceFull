package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entities.Country;

public class CountryDAO {

	public Country getCountry(int countryID) {
		Country country = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost\\SQLExpress;database=servicedirectory;", "sa", "12345678");
			String query = "SELECT*FROM country WHERE countryid='"+countryID+"'";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				country = new Country();
				country.setCountryID(countryID);
				country.setCountryName(rs.getString("countryname"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return country;
	}
}
