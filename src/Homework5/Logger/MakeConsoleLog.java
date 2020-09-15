package Homework5.Logger;

import Homework5.Logger.ConsoleLogger;
import Homework5.Logger.Logger;

public class MakeConsoleLog extends LoggerWriter{
    @Override
    public Logger createLog() {
        return new ConsoleLogger();
    }
}
