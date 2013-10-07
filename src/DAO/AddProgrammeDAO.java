package DAO;

import java.sql.DriverManager;

import Entities.Programme;

import com.sun.corba.se.pept.transport.Connection;

public class AddProgrammeDAO {
	
	Connection conn;
	
	public AddProgrammeDAO(){
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
	
	public void addProgramme(Programme programme){
		
	}
}
