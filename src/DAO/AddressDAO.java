package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entities.Address;

public class AddressDAO {
	public Address getAddress(int addressID) {
		Address address = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost\\SQLExpress;database=servicedirectory;", "sa", "12345678");
			String query = "SELECT*FROM address WHERE addressid='"+addressID+"'";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				address = new Address();
				address.setAddressID(addressID);
				address.setPostCode(rs.getString("postCode"));
				address.setTownID(rs.getInt("townID"));
				address.setCountyID(rs.getInt("countyID"));
				address.setCountryID(rs.getInt("countryID"));
				address.setAddressName(rs.getString("addressname"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return address;
	}
	
	
	public ArrayList<Address> searchAddress(String postCode, String street, String town){
		ArrayList<Address> addressList = new ArrayList<Address>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost\\SQLExpress;database=servicedirectory;", "sa", "12345678");
			String query = "SELECT a.addressid,a.postcode,a.townid,a.countyid," +
					"a.countryid,a.addressname FROM address a " +
					"INNER JOIN town t ON a.townid = t.townid" +
					"INNER JOIN county cty ON a.countyid = cty.countyid" +
					"INNER JOIN country ctry ON a.countryid = ctry.countryid" +
					"WHERE a.postcode LIKE '%'"+postCode+"'%' " +
					"AND a.addressname LIKE '%'"+street+"'%' " +
					"AND t.townname LIKE '%'"+town+"'%'";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			Address temp = new Address();
			while (rs.next()) {
				temp.setAddressID(rs.getInt("addressID"));
				temp.setAddressName(rs.getString("addressName"));
				temp.setCountryID(rs.getInt("countryID"));
				temp.setCountyID(rs.getInt("countyID"));
				temp.setPostCode(rs.getString("postCode"));
				temp.setTownID(rs.getInt("townID"));
				addressList.add(temp);
			}
			rs.close();
			ps.close();
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addressList;
	}
}
