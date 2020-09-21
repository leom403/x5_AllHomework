package Homework3.part3_Student;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    private int scholarship;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship(int scholarship) {
        return scholarship;
    }


    public int getScholarship() {
        double maxAvarageMerk = 5;
        int maxScholarship = 100;
        int minScholarship = 80;
        if (averageMark == maxAvarageMerk) {
            return scholarship = maxScholarship;
        } else {
            return scholarship = minScholarship;
        }
    }
}