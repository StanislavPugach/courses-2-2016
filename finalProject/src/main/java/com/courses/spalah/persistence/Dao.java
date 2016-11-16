package com.courses.spalah.persistence;

/**
 * @author Ievgen Tararaka
 */
public interface Dao<E, I> {
    E getById(I id);

    E save(E entity);
}
