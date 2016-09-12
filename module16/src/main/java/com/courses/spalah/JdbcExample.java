package com.courses.spalah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ievgen Tararaka
 */
public class JdbcExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        registerDriver();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root"); // открытие соединения к базе
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM test.person");
        int columnCount = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(rs.getString(i));
            }
        }
    }

    /**
     * Для Java 6 и ниже необходимо зарегистрировать драйвер
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private static void registerDriver() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // или любой другой драйвер
        Class.forName("com.mysql.jdbc.Driver");
    }
}
