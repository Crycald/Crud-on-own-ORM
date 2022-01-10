package com.dybikowski.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {
    private final static String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final static String USER_DB = System.getenv("java_update_userDB");
    private final static String USER_DB_PWD = System.getenv("java_update_userDB_pwd");
    private final static String DB_URL = "jdbc:mysql://localhost:3306/java_update_db";

    public static Connection connect() {
        Connection connection = null;

        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER_DB, USER_DB_PWD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
