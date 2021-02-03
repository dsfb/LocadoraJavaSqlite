package com.github.dsfb.locadorajavasqlite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() throws SQLException {
		// db parameters
		String url = "jdbc:sqlite:./test.db";

		// create a connection to the database
		return DriverManager.getConnection(url);
	}
}
