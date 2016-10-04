package com.courses.spalah.homework;

import java.sql.*;

/**
 * Created by Stanislav Pugach on 21.09.2016.
 */
public class Person extends DataManage {
    private static final String SAVE_PERSON = "INSERT INTO people.person " +
            "(first_name, last_name, address_id) VALUES (?,?,?);";
    private static final String LOAD_PERSON = "SELECT first_name, last_name, address" +
            " FROM people.person AS p INNER JOIN " +
            "people.address AS a ON p.address_id = a.id WHERE address_id LIKE ?;";
    private String firstName;
    private String lastName;
    private String address;
    private DriverConnection driverConnection;

    public Person() {
        this.driverConnection = new DriverConnection();
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "Homeless";
        this.driverConnection = new DriverConnection();

    }

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.driverConnection = new DriverConnection();

    }

    @Override
    public int save() {
        int addressID = new Address(address).save();
        Connection connection = driverConnection.getConnection();
        PreparedStatement statement = null;
        int ID = 0;
        try {
            statement = connection.prepareStatement(SAVE_PERSON,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,firstName);
            statement.setString(2,lastName);
            statement.setInt(3,addressID);
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            generatedKeys.next();
            ID = generatedKeys.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ID;
    }

    @Override
    public Person load(int id) {
        Connection connection = driverConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(LOAD_PERSON);
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            result.next();
            this.firstName = result.getString("first_name");
            this.lastName = result.getString("last_name");
            this.address = result.getString("address");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}
