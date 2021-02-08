package com.github.dsfb.locadorajavasqlite.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

// Source idea: JetBrains Academy! ;)
public class ConnectionFactory {
	private static final String url = "jdbc:sqlite:./test.db";
	private SQLiteDataSource dataSource = null;

	private static ConnectionFactory instance;
	
	private static synchronized ConnectionFactory getInstance() {
		if (instance == null) {
			instance = new ConnectionFactory();
		}

		return instance;
	}
	
	private ConnectionFactory() {
		dataSource = new SQLiteDataSource();
		dataSource.setUrl(url);
	}

	private SQLiteDataSource getDataSource() {
		return this.dataSource;
	}
	
	public static Connection getConnection() throws SQLException {
		return getInstance().getDataSource().getConnection();
	}
}
