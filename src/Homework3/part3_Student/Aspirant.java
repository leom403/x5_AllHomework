package Homework3.part3_Student;

public class Aspirant extends Student {

    public Aspirant() {

    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }


    @Override                                       // я не забыл про него, я его переопределил
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return setScholarship(200);
        } else {
            return setScholarship(180);
        }
    }

}