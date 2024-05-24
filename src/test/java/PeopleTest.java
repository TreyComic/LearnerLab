import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void add() {
        List<Person> peopleList = new ArrayList<>();
        Person person1 = new Person("Jack Black");
        peopleList.add(person1);
        People people = new People(peopleList);
        assertEquals(1, people.getPeopleList().size());
    }

    @Test
    void findById() {
        List<Person> peopleList = new ArrayList<>();
        Person person1 = new Person("Jack Black");
        peopleList.add(person1);
        People people = new People(peopleList);
        long actual = person1.getUniqueId();
        assertEquals(1l, actual);
    }

    @Test
    void removeByObject() {
        List<Person> peopleList = new ArrayList<>();
        Person person1 = new Person("Jack Black");
        peopleList.remove(person1);
        People people = new People(peopleList);
        assertEquals(0, people.getPeopleList().size());
    }
}