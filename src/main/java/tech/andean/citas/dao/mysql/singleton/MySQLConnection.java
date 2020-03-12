package tech.andean.citas.dao.mysql.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static MySQLConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/bd_cita_medica?useSSL=false"; // <-- URL de la base de datos aqui
    private String username = ""; // <-- Usuario de base de datos aqui
    private String password = ""; // <-- Clave de la base de datos

    private MySQLConnection()  throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MySQLConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new MySQLConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new MySQLConnection();
        }

        return instance;
    }

}
