package core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {


    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(
                Constants.DB_URL.getValue(),
                Constants.DB_USER.getValue(),
                Constants.DB_PASSWORD.getValue());

        System.out.println("Connected to database");
        return conn;
    }
}
