package com.github.dsfb.locadorajavasqlite;

import java.sql.Connection;
import java.sql.SQLException;

import com.github.dsfb.locadorajavasqlite.jdbc.ConnectionFactory;

class LocadoraJavaSqlite {

	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory(); 
		try {
			Connection connection = factory.getConnection();
			System.out.println("The connection is opened!");
			connection.close();
			System.out.println("The connection is closed!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
