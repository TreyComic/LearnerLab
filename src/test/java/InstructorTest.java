import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor instructor = new Instructor("Mikaila");
    Student student1 = new Student("Jake", 4);
    Student student2 = new Student("Doug", 8);
    @Test
    void teach() {
        instructor.teach(student1, 5);
        double actual = student1.getTotalStudyTime();
        assertEquals(9, actual);
    }

    @Test
    void lecture() {
        instructor.teach(student1, 5);
        double actual1 = student1.getTotalStudyTime();
        assertEquals(9, actual1);
        instructor.teach(student2, 5);
        double actual2 = student2.getTotalStudyTime();
        assertEquals(13, actual2);
    }
}