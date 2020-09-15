package Homework5.Logger;

import Homework5.Logger.Logger;

public class MakeDbLog extends LoggerWriter{
    @Override
    public Logger createLog() {
        return new DbLogger();
    }
}
