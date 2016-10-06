package com.courses.spalah.homework;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.*;

/**
 * Created by Stanislav Pugach on 21.09.2016.
 */
public class Address {
    private static final String SAVE_ADDRESS_TO_DB = "INSERT INTO people.address (address) VALUES (?);";
    private static final String LOAD_ADDRESS_BY_ID = "SELECT address FROM people.address WHERE id = ?;";
    private static final String ADDRESS_COLUMN = "address";
    private String address;

    public Address() {

    }

    public Address(String address) {
        this.address = address;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
