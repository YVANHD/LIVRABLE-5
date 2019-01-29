package com.objis.cameroun.ucs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {
	
	// Information d'accès à la base de données
	public static String url = "jdbc:mysql://localhost/bdcosmetics";
	public static String login = "root";//nom d'utilisateur de la base des données
	public static String passwd = "123456";//mot de passe
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			}catch (SQLException e) {
				
				System.out.println("Probleme de connection"); 
				
			}
			
		}
		
		return connection;
		
	}

}
