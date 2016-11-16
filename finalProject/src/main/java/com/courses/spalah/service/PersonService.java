package com.courses.spalah.service;

import com.courses.spalah.domain.Person;

/**
 * @author Ievgen Tararaka
 */
public interface PersonService {
    Person getById(long id);

    Person save(Person person);
}
