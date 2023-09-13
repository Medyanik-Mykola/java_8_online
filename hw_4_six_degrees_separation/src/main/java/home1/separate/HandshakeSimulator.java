package home1.separate;

public class HandshakeSimulator {
    public static void handshakeSimulatorMethod(){
        int numberOfPeople = 6;
        PersonDetails [] people = new PersonDetails[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            people[i] = new PersonDetails(i + 1);
        }
        for (int i = 0; i < numberOfPeople - 1; i++) {
            people[i].shakeHands(people[i + 1]);
        }

        people[0].sendMessage("Hello, World!");
    }
}
