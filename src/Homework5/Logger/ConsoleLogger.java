package Homework5.Logger;

import Homework5.Logger.Calculator;

public class ConsoleLogger extends Calculator implements Logger  {

    @Override
    public void log() {
        System.out.println("Log into console: " + getresult());
    }
}