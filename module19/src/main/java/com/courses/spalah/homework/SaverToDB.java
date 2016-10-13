package com.courses.spalah.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * Created by Stanislav Pugach on 09.10.2016.
 */
public class SaverToDB {
    private DriverConnection driverConnection;

    public SaverToDB() {
        driverConnection = new DriverConnection();
    }

    public void save(ReflectionSever instance) {
        Connection connection = driverConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(generateQuery(instance));
            statement = insertValuesIntoStatement(instance.getValues(),statement);
            statement.executeUpdate();
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
    }

    private String generateQuery(ReflectionSever instance) {
        StringBuilder query = new StringBuilder("INSERT INTO ");
        query.append(instance.getTableName() + " (");
        ArrayList<String> columns = instance.getColumns();
        for (int i = 0; i < columns.size(); i++) {
            query.append(columns.get(i) + ",");
        }
        query.deleteCharAt(query.length() - 1);
        query.append(") VALUES (" + getParametersQuery(instance.getValues()) + ");");
        return query.toString();
    }

    private PreparedStatement insertValuesIntoStatement(ArrayList<Object> values, PreparedStatement statement) throws SQLException {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) instanceof Integer) {
                statement.setInt(i + 1, Integer.parseInt(values.get(i).toString()));
            }
            else {
                statement.setString(i + 1, (String) values.get(i));
            }
        }
        return statement;
    }

    private String getParametersQuery(ArrayList<Object> values){
        String result = "";
        for (int i = 0; i < values.size(); i++) {
            result += "?,";
        }
        result = result.substring(0,result.length() - 1);
        return result;
    }
}
