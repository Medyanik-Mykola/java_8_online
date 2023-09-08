package home1.separate;
public class Person {
    private String name;
    private Person nextPerson;
    private String message;

    public Person(String s) {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }

    public String getName() {
        return name;
    }

    public Person getNextPerson() {
        return nextPerson;
    }
}
