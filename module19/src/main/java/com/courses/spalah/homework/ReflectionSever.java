package com.courses.spalah.homework;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Stanislav Pugach on 08.10.2016.
 */
public class ReflectionSever {
    private String tableName;
    private ArrayList<String> columns;
    private ArrayList<Object> values;
    private SaverToDB saverToDB;

    public ReflectionSever() {
        saverToDB = new SaverToDB();
        columns = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void save(Object obj) throws IllegalAccessException, ClassNotFoundException {
        Class clazz = Class.forName(obj.getClass().getName());
        tableName = getReflectionTableName(clazz);
        initColumnsAndValues(clazz, obj);
        saverToDB.save(this);
    }

    private void initColumnsAndValues(Class clazz, Object obj) throws IllegalAccessException {
        String column = "";
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(ToColumn.class)) {
                column = fields[i].getAnnotation(ToColumn.class).name();
                if (!fields[i].isAccessible()) {
                    fields[i].setAccessible(true);
                }
                if (fields[i].getType().equals(String.class)) {
                    String value = String.valueOf(fields[i].get(obj));
                    columns.add(column);
                    values.add(value);
                } else if (fields[i].getType().equals(int.class)){
                    Integer value = (Integer)fields[i].get(obj);
                    columns.add(column);
                    values.add(value);
                }
                else {
                    throw new IllegalArgumentException("Unsupported type of field");
                }
            }
        }
    }

    private String getReflectionTableName(Class clazz) {
        String tableName = "";
        Annotation annotation = clazz.getAnnotation(ToTable.class);
        if (annotation instanceof ToTable) {
            tableName = ((ToTable) annotation).name();
        }
        return tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public ArrayList<String> getColumns() {
        return columns;
    }

    public ArrayList<Object> getValues() {
        return values;
    }
}
