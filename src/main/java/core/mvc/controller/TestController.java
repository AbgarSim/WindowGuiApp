package core.mvc.controller;

import core.database.ConnectionManager;

import java.sql.SQLException;

public class TestController {


    public void testConnection(){
        try {
            ConnectionManager.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
