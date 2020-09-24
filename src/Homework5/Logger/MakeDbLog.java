package Homework5.Logger;

public class MakeDbLog extends LoggerWriter{
    @Override
    public Logger createLog() {
        return new DbLogger();
    }
}
