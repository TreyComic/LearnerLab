import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {

    private List<Person> peopleList = new ArrayList<>();

    public People(List<Person> peopleList) {
        this.peopleList = peopleList;
    }

    public void add(Person person){
        peopleList.add(person);
    }

    public Person findById(long id){
        for(Person person : peopleList){
            if(person.id == id){
                return person;
            }
        }
        return null;
    }

    public boolean listContains(Person person){
        if(peopleList.contains(person)){
            return true;
        }
        return false;
    }

    public void removeById(long id){
        for(Person person : peopleList){
            if(person.id == id){
                peopleList.remove(person);
            }
        }
    }

    public void removeByObject(Person person){
        peopleList.remove(person);
    }

    public void removeAll(){
        peopleList.removeAll(peopleList);
    }

    public int count(){
        return peopleList.size();
    }

    public Person[] toArray(){
        return this.peopleList.toArray(new Person[0]);
    }

    public Iterator<Person> personIterator(){
        return peopleList.iterator();
    }

    public List<Person> getPeopleList() {
        return peopleList;
    }

    public void setPeople(List<Person> peopleList) {
        this.peopleList = peopleList;
    }
}
