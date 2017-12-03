package cibertec.rest.cnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public Connection getConnection() {

		Connection connection = null;

		try {
			String connectionURL = "jdbc:mysql://localhost:3306/bd_rest_dswii";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "mysql");

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.getLocalizedMessage();
		}
		return connection;
	}

}
