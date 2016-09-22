package com.courses.spalah.homework;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Stanislav Pugach on 21.09.2016.
 */
 class DriverConnection {
    private static final String DB_PROPERTIES = "/connectionDB.properties";
    private String URL;
    private String user;
    private String password;

    public DriverConnection() {
        init();
    }

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private void init() {
        Properties properties = new Properties();
        try {
            properties.load(DriverConnection.class.getResourceAsStream(DB_PROPERTIES));
            URL = properties.getProperty("URL");
            user = properties.getProperty("url");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
