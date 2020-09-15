package Homework3.part3_Student;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;
    protected int scholarship;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {

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

    public int setScholarship(int scholarship) {
        return scholarship;
    }


    public int getScholarship() {
        if (averageMark == 5) {
            return scholarship = 100;
        } else {
            return scholarship = 80;
        }
    }
}