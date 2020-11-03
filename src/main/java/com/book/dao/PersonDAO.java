package com.book.dao;

import com.book.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "LOL"));
        people.add(new Person(++PEOPLE_COUNT, "Hig"));
        people.add(new Person(++PEOPLE_COUNT, "Russia"));
        people.add(new Person(++PEOPLE_COUNT, "Bear"));
    }

    public List<Person> all(){
        return people;
    }

    public Person one(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
