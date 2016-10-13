package com.courses.spalah.homework;

/**
 * Created by Stanislav Pugach on 09.10.2016.
 */
@ToTable(name = "module19.person")
public class TestClas {
    @ToColumn(name = "salary")
    private int salary;
    @ToColumn(name = "first_name")
    private String firstName;
    @ToColumn(name = "last_name")
    private String lastName;

    public TestClas(int salary, String firstName, String lastName) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
