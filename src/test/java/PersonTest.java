import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
        String name = "Dave";
        long id = 1l;
        Person person = new Person(name);
    }

    @Test
    public void PersonConstructor(){
        String name = "Dave";
        long id = 1l;
        Person person = new Person(name);
        assertEquals(id, person.id);
        assertEquals(name, person.getName());
    }

    @Test
    void getName() {
        String name = "Dave";
        long id = 1l;
        Person person = new Person(name);
        assertEquals(name, person.getName());
    }

    @Test
    void setName() {
        String name = "Dave";
        long id = 1l;
        String Name = "David";
        Person person = new Person(name);
        person.setName(Name);
        assertEquals(Name, person.getName());
    }
}