package com.courses.spalah;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.IllegalFormatException;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

/**
 * @author Ievgen Tararaka
 */
public class Throws {
    public static void main(String[] args) throws FileNotFoundException, DuplicateName, SQLException {
        if (true) {
            throw new FileNotFoundException();
        }

        if (true) {
            throw new DuplicateName();
        }

        if (true) {
            throw new SQLException();
        }
    }
}
