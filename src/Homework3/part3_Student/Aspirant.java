package Homework3.part3_Student;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }


    @Override                                       // я не забыл про него, я его переопределил
    public int getScholarship() {
        double maxAvarageMerk = 5;
        int maxScholarship = 200;
        int minScholarship = 180;
        if (getAverageMark() == maxAvarageMerk) {
            return maxScholarship;
        } else {
            return minScholarship;
        }
    }

}