package Homework5.Computer.storage;

import Homework5.Computer.MakeInsert;

public class MakeInsertHDD extends MakeInsert {
    @Override
    public InsertHDD makeinsert() {
        return new InsertHDD();
    }

}