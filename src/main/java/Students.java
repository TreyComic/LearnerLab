import java.util.ArrayList;
import java.util.List;

public class Students extends People {
    private List<Student> studentList = new ArrayList<>();
    //private final Students instance = new Students();

    public Students(List<Person> peopleList) {
        super(peopleList);
    }


    private void Students(){
        populateStudents();
    }

    private void populateStudents(){
        studentList.add(new Student("Jack", 4));
        studentList.add(new Student("Mack", 13));
        studentList.add(new Student("Jill", 43));
    }

//    public Students getInstance() {
//        //return instance;
//    }
}
