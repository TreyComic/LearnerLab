public class Person {
    final long id;
    private String name;

    private long uniqueId;
    public Person(String name) {
       uniqueId++;
        this.id = uniqueId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUniqueId() {
        return uniqueId;
    }
}
