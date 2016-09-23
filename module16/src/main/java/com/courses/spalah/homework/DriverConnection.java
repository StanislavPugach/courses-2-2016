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
    private static final String DB_PROPERTIES = "connectionDB.properties";
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
        InputStream input = getClass().getClassLoader().getResourceAsStream(DB_PROPERTIES);
        try {
            if (input != null) {
                properties.load(input);
            } else {
                throw new FileNotFoundException("Property file "+ DB_PROPERTIES + " not found in the classpath");
            }

            URL = properties.getProperty("URL");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
