package com.courses.spalah.mvc;

import com.courses.spalah.domain.Person;
import com.courses.spalah.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ievgen Tararaka
 */
@RestController
@RequestMapping(value = "/persons",  produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Person> getPerson(@RequestParam long id) {
        Person person = personService.getById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public ResponseEntity<Person> savePerson(@RequestParam String name) {
        Person newPerson = new Person();
        newPerson.setName(name);

        Person savedPerson = personService.save(newPerson);
        return new ResponseEntity<>(savedPerson, HttpStatus.OK);
    }
}
