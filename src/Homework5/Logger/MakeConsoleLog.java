package Homework5.Logger;

public class MakeConsoleLog extends LoggerWriter{
    @Override
    public Logger createLog() {
        return new ConsoleLogger();
    }
}
