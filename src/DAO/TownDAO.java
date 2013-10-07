package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entities.Town;

public class TownDAO {
	public Town getTown(int townID) {
		Town town = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost\\SQLExpress;database=servicedirectory;", "sa", "12345678");
			String query = "SELECT*FROM town WHERE townid='"+townID+"'";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				town = new Town();
				town.setTownID(townID);
				town.setCountyID(rs.getInt("countyID"));
				town.setCountryID(rs.getInt("countryID"));
				town.setTownName(rs.getString("townname"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return town;
	}
}
