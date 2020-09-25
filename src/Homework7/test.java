package Homework7;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class test {
//    void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
//
//    }
//    void balance(int accountId) throws UnknownAccountException {
//
//    }
//    void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
//
//    }
//
//    void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
//
//    }

    public test() {
    }

    //версия без листа
    public static Account read() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
                String[] arr = str.split("\\|");
                new Account(String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return null;
    }

//    public void balance(int accountId) throws UnknownAccountException {
//        try {
//
//        } catch (UnknownAccountException ex) {
//            System.out.println();
//        }
//    }

////вариант через лист
//    public static Account read() {
//        List<String> list = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
//            String str;
//            list = reader.lines().collect(Collectors.toList());
//
////в коде листа ничего не делает.
//            while ((str = reader.readLine()) != null) {
//                String[] arr = str.split("\\|");
//                return new Account(String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        list.forEach(System.out::println);      //печать на экран всех акков
//        return null;
//    }
//
//    public void idCheck() {
//
//    }
}
