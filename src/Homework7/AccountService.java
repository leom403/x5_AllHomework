package Homework7;

import java.io.*;
import java.util.*;
import Homework7.Exeptions.*;

public class AccountService implements AccountServiceImplement {
    private CheckImpl<Account> checkAcc;

    public AccountService(CheckImpl<Account> checkAcc) {
        this.checkAcc = checkAcc;
    }
        final static String filePath = "Accounts.txt";

    public static void main(String[] args) {
        //read text file to HashMap
        Map<String, Integer> mapFromFile = getHashMapFromTextFile();

        //iterate over HashMap entries
        for(Map.Entry<String, Integer> entry : mapFromFile.entrySet()){
            System.out.println( entry.getKey() + " :: " + entry.getValue() );
        }
        System.out.println();
    }

    public static Map<String, Integer> getHashMapFromTextFile(){
        Map<String, Integer> mapFileContents = new HashMap<String, Integer>();
        BufferedReader br = null;
        try{
                                                    //создаём файл
            File file = new File(filePath);
                                                    //буферизуем
            br = new BufferedReader( new FileReader(file) );
            String line = null;
                                                    //читаем
            while ( (line = br.readLine()) != null ){
                                                    //делим на части
                String[] parts = line.split("\\|");
                String nameIds = parts[0].trim();
                String nameHolders = parts[1].trim();             //оно нам не нужно
                Integer nameAmount = Integer.parseInt( parts[2].trim() );

                //put nameIds, nameAmount in HashMap if they are not empty
                if( !nameIds.equals("") && !nameAmount.equals("") )
                    mapFileContents.put(nameIds, nameAmount);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            //Always close the BufferedReader
            if(br != null){
                try {
                    br.close();
                }catch(Exception e){};
            }
        }
        return mapFileContents;
    }

//ридер читает и возвращает акк
//    public static Account read() throws IOException {               //рефактор в баланс
//        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
//            String str;
//            Account account = null;
//            Scanner scanner = new Scanner(System.in);
//            String input = "aaa 2569";
////            String input = scanner.nextLine();
//            String[] inputDevide = input.split(" ");
//            while ((str = reader.readLine()) != null) {
//                                                                  // разделение строкии поиск по 2 значению  - ид
//                if (str.startsWith(inputDevide[1])) {
//                    String[] arr = str.split("\\|");
//                    return new Account(String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
//                }
//            }
//            return account;
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            throw ex;
//        }
//    }
//
    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Map<String, Integer> mapFromFile = getHashMapFromTextFile();
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        Account account = checkAcc.get(accountId);
        if (account == null) {
            throw new UnknownAccountException("Нет такого аккаунта в системе");
        }
        System.out.println("Сумма на аккаунте " + account.getId() + " составляет: " + account.getAmount());
        Map<String, Integer> mapFromFile = getHashMapFromTextFile();


//        for(Map.Entry<String, Integer> entry : mapFromFile.entrySet()) {
//            System.out.println(entry.getKey() + " :: " + entry.getValue());
//        }
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {

    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {

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


////вариант через лист
//    public static void readFile() {
//        List<String> list = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
//            list = reader.lines().collect(Collectors.toList());
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        list.forEach(System.out::println);      //печать на экран всех акков
//    }
    }
