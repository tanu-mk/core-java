package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");//static block
		Connection conObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/egg", "root", "root");
		String insertQuery = "insert into egg.tourist_info values(0, 'Manali', 1722, 'J&K', 'Snow', 'October');";
		//syntax
		Statement statement = conObject.createStatement();
		
		int rowsAffected = statement.executeUpdate(insertQuery);
		log.info("rowsAffected " + rowsAffected);
		
		conObject.close();
	
	}catch(ClassNotFoundException event){
			log.info("ClassNotFoundException problem loading driver, class name is wrong " + event.getMessage());
		}
		catch(SQLException e){
			log.info("SQLException connecting to DB, either URL,UN or Pwd is wrong " + e.getMessage());
		}
	}

}
