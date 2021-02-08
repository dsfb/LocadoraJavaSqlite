package com.github.dsfb.locadorajavasqlite.control;

import java.sql.Connection;
import java.sql.SQLException;

import com.github.dsfb.locadorajavasqlite.jdbc.ConnectionFactory;
import com.github.dsfb.locadorajavasqlite.tco.LocadoraTco;
import com.github.dsfb.locadorajavasqlite.view.View;

public class Control {
	private View view = null;
	private int option;

	public Control(View view) {
		this.view = view;
	}

	public boolean start() {
		try {
			LocadoraTco.createTables();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean stop() {
		try {
			connection.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void control() {
		this.start();
		do {
			this.view.showMenu();
			this.option = this.view.getUserOption();
			System.out.println("Você digitou a opção: " + this.option);
			break;
		} while (this.option > 0);
	}
}
