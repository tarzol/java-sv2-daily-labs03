package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    List<String> names = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.trim().contains(" ")) {
            names.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public List<String> getNames() {
        return names;
    }

    public static void main(String[] args) {

        Journal journal1 = new Journal();

        journal1.addStudent("Kis Piroska");
        journal1.addStudent("KisPiros");
        journal1.addStudent("Kis Tibor");

        System.out.println("Lista hossza: "+journal1.getNames().size());
        System.out.println("Adatok: "+journal1.getNames().get(0).toString());
        System.out.println("Adatok: "+journal1.getNames().get(1).toString());
    }
}
