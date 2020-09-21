package Homework3.part3_Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Олег", "Петров", "5", 5);
        students[1] = new Student("Таня", "Фортова", "3", 3.4);                //ср балл не установлен, общий конструктор
        students[2] = new Aspirant("Василий", "Смирнов", "4", 5);
        students[3] = new Aspirant("Петя", "Наусов", "2", 4.9);               //ср балл не установлен, общий конструктор

        for (int i = 0; i < students.length; i++) {
            students[i].getScholarship();
            System.out.println(students[i].getLastName() + "-" + students[i].getScholarship());
        }
    }
}