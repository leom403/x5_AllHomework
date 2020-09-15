package Homework5.Logger;

public class DbLogger extends Calculator implements Logger {

@Override
    public void log() {
    System.out.println("Log into database: " + getresult());
    }
}