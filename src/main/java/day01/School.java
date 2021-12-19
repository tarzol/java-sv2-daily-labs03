package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        students.addHeight(160);
        students.addHeight(170);
        students.addHeight(165);
        students.addHeight(190);
        System.out.println("Is increasing? "+students.isHeightsIncreasing());
    }
}
