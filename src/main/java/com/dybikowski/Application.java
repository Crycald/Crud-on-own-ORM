package com.dybikowski;

import com.dybikowski.model.Client;
import com.dybikowski.persistance.sql.SqlPersistenceManager;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        Client client = Client.builder()
                .id(1L)
                .firstName("Krzysiek")
                .lastName("Dybikowski")
                .phoneNumber("123-123-123")
                .emailAddress("krzysiekdybikows@asd.com")
                .build();

        SqlPersistenceManager a = new SqlPersistenceManager();
        try {
            a.create(client);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
