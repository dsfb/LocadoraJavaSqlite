package com.github.dsfb.locadorajavasqlite;

import com.github.dsfb.locadorajavasqlite.control.Control;
import com.github.dsfb.locadorajavasqlite.view.View;

class LocadoraJavaSqlite {

	public static void main(String[] args) {
		View view = new View();
		Control control = new Control(view);
		control.control();
	}

}
