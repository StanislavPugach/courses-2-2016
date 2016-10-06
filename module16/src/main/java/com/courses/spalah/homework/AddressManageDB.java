package com.courses.spalah.homework;

import java.sql.*;

/**
 * Created by Stanislav Pugach on 06.10.2016.
 */
public class AddressManageDB extends DataManage<Address>{
    private static final String SAVE_ADDRESS_TO_DB = "INSERT INTO people.address (address) VALUES (?);";
    private static final String LOAD_ADDRESS_BY_ID = "SELECT address FROM people.address WHERE id = ?;";
    private static final String ADDRESS_COLUMN = "address";
    private DriverConnection driverConnection;

    public AddressManageDB() {
        driverConnection = new DriverConnection();
    }


    @Override
    public int save(Address obj) {
        Connection connection = driverConnection.getConnection();
        PreparedStatement statement = null;
        int ID = 0;
        try {
            statement = connection.prepareStatement(SAVE_ADDRESS_TO_DB, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,obj.getAddress());
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
    public Address load(int id) {
        Connection connection = driverConnection.getConnection();
        PreparedStatement statement = null;
        Address address = null;
        try {
            statement = connection.prepareStatement(LOAD_ADDRESS_BY_ID);
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            result.next();
            address = new Address(result.getString(ADDRESS_COLUMN));
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
        return address;
    }
}
