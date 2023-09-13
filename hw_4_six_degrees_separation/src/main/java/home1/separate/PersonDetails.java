package home1.separate;

public class PersonDetails {
    private int id;
    private PersonDetails nextperson;

    public PersonDetails(int id) {
        this.id = id;
    }

    public void shakeHands(PersonDetails anotherperson){
        this.nextperson = anotherperson;
    }

    public void sendMessage(String message){
        System.out.println("Person "+ id + "sends massage: " + message );

        if (nextperson != null){
            nextperson.receiveMessage(message);
        }else{
            System.out.println("Massage reached the end ");
        }
    }

    public void receiveMessage (String message){
        System.out.println("Person "+ id + "receive massage: " + message );

        if (nextperson != null) {
            nextperson.receiveMessage(message);
        } else {
            System.out.println("Message reached the end.");
        }
    }
}

