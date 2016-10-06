package com.courses.spalah.homework;

import java.sql.*;

/**
 * Created by Stanislav Pugach on 06.10.2016.
 */
public class PersonManageDB extends DataManage<Person> {
    private static final String SAVE_PERSON = "INSERT INTO people.person " +
            "(first_name, last_name, address_id) VALUES (?,?,?);";
    private static final String LOAD_PERSON = "SELECT first_name, last_name, address" +
            " FROM people.person AS p INNER JOIN " +
            "people.address AS a ON p.address_id = a.id WHERE address_id LIKE ?;";
    private DriverConnection driverConnection;

    public PersonManageDB() {
        driverConnection = new DriverConnection();
    }

    @Override
    public int save(Person obj) {
        AddressManageDB addressManageDB = new AddressManageDB();
        int addressID = addressManageDB.save(new Address(obj.getAddress()));
        Connection connection = driverConnection.getConnection();
        PreparedStatement statement = null;
        int ID = 0;
        try {
            statement = connection.prepareStatement(SAVE_PERSON, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,obj.getFirstName());
            statement.setString(2,obj.getLastName());
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
        Person person = new Person();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(LOAD_PERSON);
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            result.next();
            person.setFirstName(result.getString("first_name"));
            person.setLastName(result.getString("last_name"));
            person.setAddress(result.getString("address"));
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
        return person;
    }
}
