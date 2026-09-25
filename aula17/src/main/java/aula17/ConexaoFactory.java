package aula17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    // URL de conexão com sqlite
    private static final String URL = "jdbc:sqlite:naruto.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

}
