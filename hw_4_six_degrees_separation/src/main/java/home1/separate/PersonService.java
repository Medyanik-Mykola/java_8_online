package home1.separate;
public class PersonService {

    public void sendMessage(String message, Person nextPerson){
        if (nextPerson != null) {
            System.out.println(name + " is sending message " + message + " to " + nextPerson);
        }else{
            System.out.println(name + " received message \"" + message + "\" sending completed");
        }
    }
    public void create (){
        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");
        Person person3 = new Person("Person 3");
        Person person4 = new Person("Person 4");
        Person person5 = new Person("Person 5");
        Person person6 = new Person("Person 6");
    }
    public void sendingMM(Person person2, Person person3, Person person1, Person person4, Person person5, Person person6){
        person1.setNextPerson(person2);
        person2.setNextPerson(person3);
        person3.setNextPerson(person4);
        person4.setNextPerson(person5);
        person5.setNextPerson(person6);
    }

}
