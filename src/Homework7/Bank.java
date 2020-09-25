package Homework7;

import java.io.*;

import static Homework7.AccountService.read;

public class Bank {
    public static void main(String[] args) throws IOException, NotEnoughMoneyException, UnknownAccountException {
        System.out.println("Добро пожаловать в нашу систему. Что требуется сделать?");
        System.out.println("\t-balance [id] –вывеси информацию о счёте\n" +
                            "\t-withdraw [id] [amount] –снять указанную сумму\n" +
                            "\t-deposite [id] [amount] –внести на счет указанную сумму\n" +
                            "\t-transfer [from] [to] [amount] –перевести сумму с одного счета на другой");

        new CheckFile();

        System.out.println(read()); //проверка чтения из файла.
    }
}
