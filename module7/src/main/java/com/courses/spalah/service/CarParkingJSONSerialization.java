package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by Пугач Станислав on 27.07.2016.
 */
public class CarParkingJSONSerialization implements CarParkingSerializer, CarParkingDeserializer {
    @Override
    public CarParking deserialize(String serializedCarParking) {

        String[] str = serializedCarParking
                .replaceAll(",","")
                .replaceAll(":","")
                .replaceAll("\\{","")
                .replaceAll("\\}","")
                .replaceAll("\\]","")
                .split("\"");

        CarParking carParking = new CarParking();
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals("address")){
                carParking.setAddress(str[i + 2]);
                carParking.setParkingName(str[i + 6]);
            }
            if (str[i].equals("manufacturer")){
                Car car = new Car();
                car.setManufacturer(str[i + 2]);
                car.setModelName(str[i + 6]);
                car.setVin(str[i + 10]);
                car.setLengthMillimeters(Integer.parseInt(str[i + 13].trim()));
                car.setHeightMillimeters(Integer.parseInt(str[i + 15].trim()));
                cars.add(car);
            }
        }

        carParking.setCars(cars.toArray(new Car[cars.size()]));
        return carParking;
    }

    @Override
    public String serialize(CarParking carParking) {
        Field[] fields = carParking.getClass().getDeclaredFields();
        StringBuilder serializeObject = new StringBuilder();
        begin(serializeObject);
        serializeObject.append(fieldsToString(fields,carParking));
        ArrayList<Field[]> carsFields = getCarsFields(carParking);
        if (carsFields.size() != 0) {
            for (int i = 0; i < carsFields.size(); i++) {
                begin(serializeObject);
                serializeObject.append(fieldsToString(carsFields.get(i), carParking.getCars()[i]));
                if (i != carsFields.size() - 1){
                    close(serializeObject).append(",");
                }
                close(serializeObject);
            }
        }
        closeArray(serializeObject);
        close(serializeObject);

        return serializeObject.toString();
    }

    private StringBuilder fieldsToString(Field[] fields, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            try {
                if (fields[i].getName().equals("cars")) {
                    stringBuilder.append("\"" + fields[i].getName() + "\"" + ":" + beginArray(stringBuilder));
                }
                stringBuilder.append("\"" + fields[i].getName() + "\"" + ":" + fields[i].get(object));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return stringBuilder;
    }

    private ArrayList<Field[]> getCarsFields(CarParking cars) {
        ArrayList<Field[]> arrayList = new ArrayList<>();
        for (int i = 0; i < cars.getCars().length; i++) {
            arrayList.add(cars.getCars()[i].getClass().getDeclaredFields());
        }
        return arrayList;
    }

    private StringBuilder beginArray(StringBuilder stringBuilder) {
        return stringBuilder.append("[\n");
    }
    private StringBuilder closeArray(StringBuilder stringBuilder) {
        return stringBuilder.append("\n]");
    }


    private StringBuilder begin(StringBuilder stringBuilder) {
        return stringBuilder.append("{\n");
    }
    private StringBuilder close(StringBuilder stringBuilder) {
        return stringBuilder.append("\n}");
    }

//    public String serialize(CarParking carParking) {
//        Field[] fields = carParking.getClass().getDeclaredFields();
//        StringBuilder stringBuilder = new StringBuilder("{");
//        stringBuilder.append("\n" +
//                "\"" +
//                "address" +
//                "\":" +
//                " \"" +
//                carParking.getAddress() +
//                "\"" +
//                ",");
//        stringBuilder.append("\n" +
//                "\"" +
//                "parkingName" +
//                "\":" +
//                " \"" +
//                carParking.getParkingName() +
//                "\"" +
//                ",");
//        stringBuilder.append("\n" +
//                "\"" +
//                "cars" +
//                "\": " +
//                " [\n{");
//        stringBuilder.append(CarsToString(carParking.getCars()));
//        stringBuilder.append("\n}" +
//                "\n]" +
//                "\n}");
//
//        return stringBuilder.toString();
//    }
//
//    private StringBuilder CarsToString(Car[] array) {
//        if (array.length == 0){
//            return null;
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            stringBuilder.append("\n" +
//                    "\"" +
//                    "manufacturer" +
//                    "\":" +
//                    " \"" +
//                    array[i].getManufacturer() +
//                    "\"" +
//                    ",");
//            stringBuilder.append("\n" +
//                    "\"" +
//                    "modelName" +
//                    "\":" +
//                    " \"" +
//                    array[i].getModelName() +
//                    "\"" +
//                    ",");
//            stringBuilder.append("\n" +
//                    "\"" +
//                    "vin" +
//                    "\":" +
//                    " \"" +
//                    array[i].getVin() +
//                    "\"" +
//                    ",");
//            stringBuilder.append("\n" +
//                    "\"" +
//                    "lengthMillimeters" +
//                    "\": " +
//                    array[i].getLengthMillimeters() +
//                    ",");
//            stringBuilder.append("\n" +
//                    "\"" +
//                    "heightMillimeters" +
//                    "\": " +
//                    array[i].getHeightMillimeters());
//            if (i < array.length - 1){
//                stringBuilder.append("\n}," +
//                        "\n{");
//            }
//        }
//        return stringBuilder;
//    }


}
