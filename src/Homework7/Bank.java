package Homework7;

import java.io.*;

public class Bank {
    public static void main(String[] args) {
        write(new Account("15","Olga", 1000));
        try {
            System.out.println(read());
        }
        catch(IOException ex){
                ex.printStackTrace();
            }
        }

    public static void write(Account account){
        try(PrintWriter writer = new PrintWriter(new FileWriter("Accounts.txt")))
        {
            writer.println(account.getId() + " | " + account.getHolder()+" | " + account.getAmount());
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static Account read()
            throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))){
            String str = reader.readLine();
            String[] arr = str.split("\\|");
            return new Account(String.valueOf(arr[0]), arr[1], Double.valueOf(arr[2]));
        }
        catch (IOException ex){
            ex.printStackTrace();throw ex;}
    }
}
