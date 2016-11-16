package com.courses.spalah.service;

import com.courses.spalah.domain.Person;
import com.courses.spalah.persistence.Dao;

/**
 * @author Ievgen Tararaka
 */
public class PersonServiceImpl implements PersonService {
    private final Dao<Person, Long> personDao;

    public PersonServiceImpl(Dao<Person, Long> personDao) {
        this.personDao = personDao;
    }

    @Override
    public Person getById(long id) {
        return personDao.getById(id);
    }

    @Override
    public Person save(Person person) {
        return personDao.save(person);
    }
}
