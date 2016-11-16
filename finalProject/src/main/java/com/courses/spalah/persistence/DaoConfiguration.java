package com.courses.spalah.persistence;

import com.courses.spalah.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ievgen Tararaka
 */
@Configuration
public class DaoConfiguration {
    @Bean
    public Dao<Person, Long> personDao() {
        return new PersonDao();
    }
}
