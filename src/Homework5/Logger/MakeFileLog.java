package Homework5.Logger;

public class MakeFileLog extends LoggerWriter{
    @Override
    public Logger createLog() {
        return new FileLogger();
    }
}
