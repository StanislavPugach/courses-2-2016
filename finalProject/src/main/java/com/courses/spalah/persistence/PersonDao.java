package com.courses.spalah.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.courses.spalah.domain.Person;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ievgen Tararaka
 */
@Transactional
public class PersonDao implements Dao<Person, Long> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Person getById(Long id) {
        return manager.find(Person.class, id);
    }

    @Override
    public Person save(Person entity) {
        manager.persist(entity);
        return entity;
    }
}
