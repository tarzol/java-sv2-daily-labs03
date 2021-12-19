package day05;

import day01.Students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<String> names = new ArrayList<>();
    boolean fullName = false;
    public boolean addStudent(String studentName) {
        if (studentName.indexOf(" ")>0) {
            names.add(studentName);
            fullName = true;
            System.out.println("Vezetéknév és keresztnév - ok: "+studentName);
        }
        return fullName;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.addStudent("Kis Piroska");
        student.addStudent("KisPiros");
        student.addStudent("Kis Tibor");
    }
}
