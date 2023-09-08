package home1.separate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PersonMenu {
    private PersonService personService = new PersonService();

    public void start () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu();
        String position = "";
        while ((position = bufferedReader.readLine()) != null){
            crud(position, bufferedReader);
            menu();
        }
    }
    private void menu (){
        System.out.println("1. Enter message");

    }
    public void crud(String position, BufferedReader bufferedReader) throws IOException {
        switch (position) {
            case "1" -> setMessage(bufferedReader);
        }
    }
    public void setMessage(BufferedReader reader) throws IOException {
        System.out.println("Enter message which you want to receive: ");
        String message = reader.readLine();
        personService.sendMessage(message);

    }
}
