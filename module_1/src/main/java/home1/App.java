package home1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    private static StudentService studentService = new StudentService();
    private static GroupService groupService = new GroupService();

    public static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu();
        String position = "";
        while ((position = bufferedReader.readLine()) != null) {
            crud(position, bufferedReader);
            menu();
        }
    }

    private static void menu() {
        System.out.println("1. Create Student");
        System.out.println("2. View Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Create Group");
        System.out.println("6. View Groups");
        System.out.println("7. Update Group");
        System.out.println("8. Delete Group");
        System.out.println("0. Exit");
        System.out.println(" ");
        System.out.print("Select an option: ");
    }

    private static void crud(String position, BufferedReader bufferedReader) throws IOException {
        switch (position) {
            case "1" -> createStudent(bufferedReader);
            case "2" -> viewStudents();
            case "3" -> updateStudent(bufferedReader);
            case "4" -> deleteStudent(bufferedReader);
            case "5" -> createGroup(bufferedReader);
            case "6" -> viewGroups();
            case "7" -> updateGroup(bufferedReader);
            case "8" -> deleteGroup(bufferedReader);
            case "0" -> System.exit(0);
        }
    }

    private static void createStudent(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Student: ");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Please enter name of Student: ");
        String name = reader.readLine();
        System.out.println("Please enter Group ID for this student: ");
        int groupId = Integer.parseInt(reader.readLine());
        studentService.create(id, name, groupId);
    }

    private static void viewStudents() {
        ArrayList<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println(" ");
            System.out.println("Student ID = " + student.getId());
            System.out.println("Name = " + student.getName());
            System.out.println("Group ID = " + student.getGroupId());
            System.out.println(" ");
        }
    }

    private static void deleteStudent(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Student to delete: ");
        int id = Integer.parseInt(reader.readLine());
        studentService.delete(id);
        System.out.println("Student with ID " + id + " deleted.");
    }

    private static void updateStudent(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Student to update: ");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Please enter updated name: ");
        String name = reader.readLine();
        System.out.println("Please enter updated Group ID: ");
        int groupId = Integer.parseInt(reader.readLine());
        studentService.update(id, name, groupId);
        System.out.println("Student updated successfully.");
    }

    private static void createGroup(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Group: ");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Please enter name of Group: ");
        String name = reader.readLine();
        groupService.create(id, name);
    }

    private static void viewGroups() {
        ArrayList<Group> groups = groupService.findAll();
        for (Group group : groups) {
            System.out.println(" ");
            System.out.println("Group ID = " + group.getId());
            System.out.println("Name = " + group.getName());
            System.out.println(" ");
        }
    }

    private static void deleteGroup(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Group to delete: ");
        int id = Integer.parseInt(reader.readLine());
        groupService.delete(id);
        System.out.println("Group with ID " + id + " deleted.");
    }

    private static void updateGroup(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Group to update: ");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Please enter updated name: ");
        String name = reader.readLine();
        groupService.update(id, name);
        System.out.println("Group updated successfully.");
    }
}
