package Homework5.Logger;

import Homework5.Logger.Logger;

public class MakeFileLog extends LoggerWriter{
    @Override
    public Logger createLog() {
        return new FileLogger();
    }
}
