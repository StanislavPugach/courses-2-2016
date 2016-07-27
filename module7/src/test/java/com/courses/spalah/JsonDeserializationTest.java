package com.courses.spalah;

import com.courses.spalah.common.Format;
import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;
import com.courses.spalah.service.CarParkingDeserializer;
import com.courses.spalah.service.SerializationFactory;
import com.courses.spalah.utils.TestUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Ievgen Tararaka
 */
@RunWith(JUnit4.class)
public class JsonDeserializationTest {
    private static final Format FORMAT = Format.JSON;

    private static String firstJson;
    private static String secondJson;

    @BeforeClass
    public static void setUp() {
        firstJson = TestUtils.readFile("deserialization/json/json1.json");
        secondJson = TestUtils.readFile("deserialization/json/json2.json");
    }

    @Test
    public void testDeserializationFirstJson() {
        CarParkingDeserializer deserializer = SerializationFactory.getDeserializer(FORMAT);
        CarParking carParking = deserializer.deserialize(firstJson);

        assertNotNull(carParking);
        equals("address", "Gagarina avenue 1", carParking.getAddress());
        equals("parkingName", "Parking #1", carParking.getParkingName());

        Car[] cars = carParking.getCars();
        assertTrue(cars.length == 2);

        Car firstCar = cars[0];

        equals("manufacturer", "Mazda", firstCar.getManufacturer());
        equals("modelName", "Mazda3", firstCar.getModelName());
        equals("vin", "ABC123456", firstCar.getVin());
        equals("lengthMillimeters", 4555, firstCar.getLengthMillimeters());
        equals("heightMillimeters", 3000, firstCar.getHeightMillimeters());

        Car secondCar = cars[1];

        equals("manufacturer", "Volvo", secondCar.getManufacturer());
        equals("modelName", "V40", secondCar.getModelName());
        equals("vin", "CBE99999", secondCar.getVin());
        equals("lengthMillimeters", 5300, secondCar.getLengthMillimeters());
        equals("heightMillimeters", 3155, secondCar.getHeightMillimeters());
    }

    @Test
    public void testDeserializationSecondJson() {
        CarParkingDeserializer deserializer = SerializationFactory.getDeserializer(FORMAT);
        CarParking carParking = deserializer.deserialize(secondJson);

        assertNotNull(carParking);
        equals("address", "St.Pauls avenue 333", carParking.getAddress());
        equals("parkingName", "The Best Parking", carParking.getParkingName());

        Car[] cars = carParking.getCars();
        assertTrue(cars.length == 0);
    }

    private static void equals(String fieldName, Object expected, Object actual) {
        assertEquals(TestUtils.fieldMessage(fieldName, expected, actual), expected, actual);
    }
}
