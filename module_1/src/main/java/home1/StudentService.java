package home1;

import java.util.ArrayList;

public class StudentService {
    private StudentDB studentDB = new StudentDB();

    public void create(int id, String name, int groupId) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setGroupId(groupId);
        studentDB.create(student);
    }

    public ArrayList<Student> findAll() {
        return studentDB.findAll();
    }
    public boolean delete(int id) {
        ArrayList<Student> students = studentDB.findAll();
        Student foundStudent = null;

        for (Student student : students) {
            if (student.getId() == (id)) {
                foundStudent = student;
                break;
            }
        }

        if (foundStudent != null) {
            studentDB.delete(foundStudent);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
        return false;
    }

    public boolean update(int id, String name, int groupId) {
        ArrayList<Student> studentsMassive = studentDB.findAll();
        for (Student student : studentsMassive) {
            if (student.getId() == (id)) {
                student.setId(id);
                student.setName(name);
                student.setGroupId(groupId);
                return false;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
        return false;
    }



}
