package aula15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    private static final String URL = "jdbc:sqlite:meubanco.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}