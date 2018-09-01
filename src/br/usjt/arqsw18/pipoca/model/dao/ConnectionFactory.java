package br.usjt.arqsw18.pipoca.model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// porque este erro nao pode ser prevenido via programa usa-se RuntimeException,
			// que é unchecked.
			throw new RuntimeException(e);
		}
	}
	
	public static Connection getConnection() throws SQLException, IOException {

		String stringConexao = "jdbc:mysql://localhost:3306/pipocadb";
		String usuario = "Alunos";
		String senha = "alunos";
		
		try {
			return DriverManager.getConnection(stringConexao,usuario,senha);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new IOException(e);
		}
		
	}
}
