package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entities.User;


public class ControlDB {
	private Connection conn;
	public ControlDB()
	{
		
	}
	//OpenConnection
	
	public void setConnection()
	{
		 try{
			 	String userName = "sa";
	            String password = "12345678";
	            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ServiceDirectory;";
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            conn = java.sql.DriverManager.getConnection(url,userName,password);
	            System.out.println("Connection Success!");
		 } catch (SQLException e){
			 System.out.println("Can't Connection!");
		 } catch (ClassNotFoundException ex){
			 
		 }
	}
	public Connection getConnection(){
		return conn;
	}
	//CloseConnection
	
	public void closeConnection()
	{
		if(conn != null)
		{
			try
			{
				conn.close();
			} catch(SQLException e)
			{
				System.out.println("Can't close Connection!");
			}
		}
	}
	

		
	
	//check account
	
	public User checkAccount(String username, String password)
	{
		User user = new User();
		try
		{
			String query = "SELECT * FROM [User] WHERE Account = '" + username + "' AND Password = '"+ password +"'";
			Statement stmt = null;
			ResultSet rs = null;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if(rs.next())
			{
				user.setUserID(rs.getInt(1));
				user.setAccount(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setRole(rs.getString(4));
				user.setPassword(rs.getString(5));
				return user;
			}
			rs.close();
			stmt.close();
		} catch(SQLException e)
		{
			System.out.print(e);
		} catch (NullPointerException ex) {
			System.out.print(ex);
		}
		return null;
	}
	public static void main(String[] args){
		ControlDB control = new ControlDB();
		control.setConnection();
		User user = control.checkAccount("longlv006", "123456");
		System.out.print(user);
	}
	
}
