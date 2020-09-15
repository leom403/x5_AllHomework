package Homework5.Logger;


public class FileLogger extends Calculator implements Logger {

    @Override
    public void log() {
        System.out.println("Log into file: " + getresult());
    }
}