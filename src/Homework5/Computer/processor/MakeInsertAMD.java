package Homework5.Computer.processor;

import Homework5.Computer.MakeInsert;

public class MakeInsertAMD extends MakeInsert {
    @Override
    public InsertAMD makeinsert() {
        return new InsertAMD();
    }

}