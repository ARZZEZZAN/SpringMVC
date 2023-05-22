package edu.armenarzz.spring.DAO;

import edu.armenarzz.spring.Models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDao {
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(1L, "Armen"));
        people.add(new Person(2L, "Vardan"));
        people.add(new Person(3L, "Temirkan"));
    }

    public List<Person> index() {
        return people;
    }
    public Person index(Long id) {
        for(Person person : people) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }
}
