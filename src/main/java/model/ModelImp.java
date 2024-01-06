package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelImp implements MODEL {
	Connection con;
	java.sql.Statement stmnt;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbForm", "root", "root");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verify(String uname, String pass) {
		
		try {
			ResultSet result = stmnt
					.executeQuery("select * from Login where email='" + uname + "' and password='" + pass + "' ");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void insertData(String name, String city, String email, String phone) {
		try {
		 stmnt.executeUpdate("insert into regesform (Nmae, City, Email, Phone) values('"+name+"', '"+city+"','"+email+"','"+phone+"')");
		System.out.println("Data inserted successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet readData() {
		try {
			ResultSet rs = stmnt.executeQuery("select * from regesform");
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteData(String email) {
		try {
			stmnt.executeUpdate("delete from regesform where Email='"+email+"' ");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(String phone, String email) {
		try {
			stmnt.executeUpdate("update regesform set Phone='"+phone+"' where Email='"+email+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
