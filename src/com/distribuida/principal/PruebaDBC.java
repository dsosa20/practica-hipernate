package com.distribuida.principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaDBC {

	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/dblibreria";
		String user ="root";
		String clave ="root";
		
		try {
			System.out.println("Estableciendo Conexion");
			Connection connection = DriverManager.getConnection(jdbcURL,user,clave);
			System.out.println("Connexion estalecida");
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
