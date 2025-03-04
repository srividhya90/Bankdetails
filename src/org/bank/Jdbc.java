package org.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "test123");
			
			String sql="Select * from student";
			
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			ResultSet result = prepareStatement.executeQuery();
			
			while(result.next())
			{
				String string = result.getString("sid");
				System.out.print(string);
				
				String string2 = result.getString("sname");
				System.out.print("\t"+string2);
				System.out.println();
			}
			
	//		String sql1="insert into student values(126,'krishna','8')";
			
		} catch (Exception e) {
			
		}
		
	}

}
