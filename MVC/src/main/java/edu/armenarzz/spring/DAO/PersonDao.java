package edu.armenarzz.spring.DAO;

import edu.armenarzz.spring.Models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDao {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Armen"));
        people.add(new Person(++PEOPLE_COUNT, "Vardan"));
        people.add(new Person(++PEOPLE_COUNT, "Temirkan"));
    }

    public List<Person> index() {
        return people;
    }
    public Person show(Long id) {
        for(Person person : people) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
