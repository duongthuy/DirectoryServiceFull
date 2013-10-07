package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entities.County;

public class CountyDAO {
	public County getCounty(int countyID) {
		County county = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost\\SQLExpress;database=servicedirectory;", "sa", "12345678");
			String query = "SELECT*FROM county WHERE countyid='"+countyID+"'";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				county = new County();
				county.setCountyID(countyID);
				county.setCountryID(rs.getInt("countryid"));
				county.setCountyName(rs.getString("countyname"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return county;
	}
}
