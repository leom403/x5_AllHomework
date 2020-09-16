package Homework5.Computer.processor;

import Homework5.Computer.MakeInsert;

public class MakeInsertIntel extends MakeInsert {
    @Override
    public InsertIntel makeinsert() {
        return new InsertIntel();
    }

}