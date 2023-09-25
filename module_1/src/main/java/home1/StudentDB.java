package home1;

import java.util.ArrayList;

public class StudentDB {
    private ArrayList<Student> studentsMassive = new ArrayList<>();
    public void create(Student student) {
        studentsMassive.add(student);
    }

    public ArrayList<Student> findAll() {
        return studentsMassive;
    }

    public void delete(Student student){
        studentsMassive.remove(student);
    }



}
