package com.SeleniumCucuDataBase.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DatabaseHelper {
	public static Properties properties;
	Logger logger = LoggerHelper.getLogger(DatabaseHelper.class);
	
	public ResultSet getConnection() throws SQLException, ClassNotFoundException {
		logger.info("waiting for database connection");
		properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream("./src/test/resources/ConfigProperties/database.properties");
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String driver = "com.mysql.jdbc.Driver";
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.setProperty(driver,"");
		
		Class.forName("com.mysql.jdbc.Driver");
		logger.info("database connection established" + url);
		Connection con = DriverManager.getConnection(url,username,password);
		Statement s = con.createStatement();
		
		 return s.executeQuery("select * from ohrm_user where user_name = username");
		
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DatabaseHelper database = new DatabaseHelper();;
		database.getConnection();
	}
}
