package com.github.dsfb.locadorajavasqlite.tco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// This is the "Table Creation Object" of this project, "Locadora".
public class LocadoraTco {
	public static void createTables(Connection conn) {
		criaTabelaFilme(conn);
	}
	
	public static void criaTabelaFilme(Connection conn) {
        // SQLite connection string
        String url = "jdbc:sqlite:test.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS filme (\n"
                + "	id integer PRIMARY KEY,\n"
        		+ " id_cliente INTEGER,\n"
                + "	name text NOT NULL,\n"
                + "	preco real\n"
                + ");";
        
        try (conn);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
