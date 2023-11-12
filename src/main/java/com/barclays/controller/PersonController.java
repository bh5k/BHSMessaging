package com.barclays.controller;

import com.barclays.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonController {

    public List<Person> getPeople() {
        List<Person> peeps = new ArrayList<>();
        Person person = new Person();
        person.setName("Bryan");
        peeps.add(person);
        return peeps;
    }
}
