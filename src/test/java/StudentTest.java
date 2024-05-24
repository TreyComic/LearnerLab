import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void setUp(){
        Student student = new Student("Jake", 12);
    }
    @Test
    void learn() {
        Student student = new Student("Jake", 12);
        student.learn(14);
        double actual = student.getTotalStudyTime();
        assertEquals(26, actual);
    }

    @Test
    void getTotalStudyTime() {
        Student student = new Student("Jake", 12);
        double actual = student.getTotalStudyTime();
        assertEquals(12, actual);
    }
    @Test
    void testImplementation(){
        Student student = new Student("Jake", 12);
        assertTrue(student instanceof Learner);
    }
    @Test
    void testInheritance(){
        Student student = new Student("Jake", 12);
        assertTrue(student instanceof Person);
    }
}