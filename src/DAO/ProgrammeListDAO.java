package DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Entities.Contact;
import Entities.Programme;

import com.sun.corba.se.pept.transport.Connection;


public class ProgrammeListDAO {
	Connection conn;
	public ProgrammeListDAO(){
		getConnection();
	}
	private void getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLExpress;database=ServiceDirectoryDB;","sa", "12345678");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Contact getContact(int contactID){
		Contact contact = null;
		String query = "SELECT * FROM Contact WHERE contactID='"+contactID+"'";
		try {
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				contact = new Contact();
				contact.setContactID(rs.getInt("contactID"));
				contact.setContactFirstName(rs.getString("contactFirstName"));
				contact.setContactSurname(rs.getString("contactSurName"));
				contact.setKnowAs(rs.getString("knowAs"));
				contact.setOfficePhone(rs.getInt("officePhone"));
				contact.setMobileHomePhone(rs.getInt("mobileHomePhone"));
				contact.setSTHomePhone(rs.getInt("STHomePhone"));
				contact.setEmailAddress(rs.getString("emailAdress"));
				//Contact manager = getManagerContact(rs.getInt("managerID"));
				//contact.setManagerName(manager);
				contact.setManagerName(null);
				contact.setContactType(rs.getString("contactType"));
				contact.setContactMethod(rs.getString("contactMethod"));
				contact.setJobRole(rs.getString("jobRole"));
				contact.setWorkbase(rs.getString("workbase"));
				contact.setActive(rs.getBoolean("isActive"));
			}			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
		}
		return contact;
	}

	/*public Contact getManagerContact(int managerContactID){
		Contact managerContact = null;
		String query = "SELECT * FROM Contact WHERE contactID='"+managerContactID+"'";
		try {
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				managerContact = new Contact();
				managerContact.setContactID(rs.getInt("contactID"));
				managerContact.setContactFirstName(rs.getString("contactFirstName"));
				managerContact.setContactSurname(rs.getString("contactSurName"));
				managerContact.setKnowAs(rs.getString("knowAs"));
				managerContact.setOfficePhone(rs.getInt("officePhone"));
				managerContact.setMobileHomePhone(rs.getInt("mobileHomePhone"));
				managerContact.setSTHomePhone(rs.getInt("STHomePhone"));
				managerContact.setEmailAddress(rs.getString("emailAdress"));
				managerContact.setContactType(rs.getString("contactType"));
				managerContact.setContactMethod(rs.getString("contactMethod"));
				managerContact.setJobRole(rs.getString("jobRole"));
				managerContact.setWorkbase(rs.getString("workbase"));
				managerContact.setActive(rs.getBoolean("isActive"));
			}			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
		}
		return managerContact;
	}*/

	public ArrayList<Programme> getProgrammeList() {
		ArrayList<Programme> ret = new ArrayList<Programme>();
		Programme programme = null;		
		String query = "SELECT * FROM Programme";
		try {
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				programme = new Programme();
				programme.setProgrammeName(rs.getString("programmeName"));
				programme.setDescription(rs.getString("description"));
				programme.setActive(rs.getBoolean("isActive"));
				programme.setContact(getContact(rs.getInt("contactID")));
				ret.add(programme);
			}			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
		}
		return ret;
	}
}
