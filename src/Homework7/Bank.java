package Homework7;

import java.io.*;

public class Bank {
    public static void main(String[] args) throws IOException {
        System.out.println("Добро пожаловать в нашу систему. Что требуется сделать?");
        System.out.println("\t-balance [id] –вывеси информацию о счёте\n" +
                            "\t-withdraw [id] [amount] –снять указанную сумму\n" +
                            "\t-deposite [id] [amount] –внести на счет указанную сумму\n" +
                            "\t-transfer [from] [to] [amount] –перевести сумму с одного счета на другой");

        new CheckFile();

    }
}
