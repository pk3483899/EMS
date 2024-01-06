package model;

import java.sql.ResultSet;

public interface MODEL {
public void connectDB();
public boolean verify(String name, String pass);
public void insertData(String name, String city, String email, String phone);
public ResultSet readData();
public void deleteData(String email);
public void update(String mobile, String email);
}
