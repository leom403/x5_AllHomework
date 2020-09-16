package Homework5.Computer.storage;

import Homework5.Computer.MakeInsert;

public class MakeInsertSSD extends MakeInsert {
    @Override
    public InsertSSD makeinsert() {
        return new InsertSSD();
    }

}