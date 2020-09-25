package Homework7;

import java.io.*;
import java.util.*;

public class AccountService implements AccountServiceImplement{


//ридер читает и возвращает акк
    public static Account read() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
            String str;
            Account account = null;
            Scanner scanner = new Scanner(System.in);
            String input = "aaa 8098";
//            String input = scanner.nextLine();
            String[] inputDevide = input.split(" ");
            while ((str = reader.readLine()) != null) {
                if (str.startsWith(inputDevide[1])) {
                    String[] arr = str.split("\\|");
                    return new Account(String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
                }
            }
            return account;
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

//    public static Account read() throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
//            String str;
//            Scanner scanner = new Scanner(System.in);
//            String input = "2248";
//            while ((str = reader.readLine()) != null) {
//                System.out.println(str);
//                String[] arr = str.split("\\|");
//                if (input.equals(arr[0])) {
//                    System.out.println(str);
//                }
//                return new Account(String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
//
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            throw ex;
//        }
//        return null;
//    }


//    public AccountService() {
//            try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
//        String str;
//        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
//            String[] arr = str.split("\\|");
//            new Account (String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
//        }
//    } catch (IOException ex) {
//        ex.printStackTrace();
//    }
//    }


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


//вариант через лист
//    public void ReadFile() {
//        List<String> list = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
//            list = reader.lines().collect(Collectors.toList());
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        list.forEach(System.out::println);      //печать на экран всех акков
//    }


    public void idCheck() {

    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {

    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {

    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {

    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {

    }
}
