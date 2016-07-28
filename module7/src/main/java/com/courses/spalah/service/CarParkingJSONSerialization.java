package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;


/**
 * Created by Пугач Станислав on 27.07.2016.
 */
public class CarParkingJSONSerialization implements CarParkingSerializer, CarParkingDeserializer {
    @Override
    public CarParking deserialize(String serializedCarParking) {
        return null;
    }

    public String serialize(CarParking carParking) {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append("\n" +
                "\"" +
                "address" +
                "\":" +
                " \"" +
                carParking.getAddress() +
                "\"" +
                ",");
        stringBuilder.append("\n" +
                "\"" +
                "parkingName" +
                "\":" +
                " \"" +
                carParking.getParkingName() +
                "\"" +
                ",");
        stringBuilder.append("\n" +
                "\"" +
                "cars" +
                "\": [" +
                " [\n{");
        stringBuilder.append(arrayOfCarsToString(carParking.getCars()));
        stringBuilder.append("\n}" +
                "\n]" +
                "\n}");

        return stringBuilder.toString();
    }

    private StringBuilder arrayOfCarsToString(Car[] array) {
        if (array.length == 0){
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append("\n" +
                    "\"" +
                    "manufacturer" +
                    "\":" +
                    " \"" +
                    array[i].getManufacturer() +
                    "\"" +
                    ",");
            stringBuilder.append("\n" +
                    "\"" +
                    "modelName" +
                    "\":" +
                    " \"" +
                    array[i].getModelName() +
                    "\"" +
                    ",");
            stringBuilder.append("\n" +
                    "\"" +
                    "vin" +
                    "\":" +
                    " \"" +
                    array[i].getVin() +
                    "\"" +
                    ",");
            stringBuilder.append("\n" +
                    "\"" +
                    "lengthMillimeters" +
                    "\":" +
                    " \"" +
                    array[i].getLengthMillimeters() +
                    "\"" +
                    ",");
            stringBuilder.append("\n" +
                    "\"" +
                    "heightMillimeters" +
                    "\":" +
                    " \"" +
                    array[i].getHeightMillimeters() +
                    "\"" +
                    ",");
            if (i < array.length - 1){
                stringBuilder.append("\n}," +
                        "\n{");
            }
        }
        return stringBuilder;
    }
}