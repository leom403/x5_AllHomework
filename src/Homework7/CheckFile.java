package Homework7;

import java.io.*;

public class CheckFile {
    private static File file = new File("Accounts.txt");

    public CheckFile() {
        if (!file.exists()) {
            WriteFile();
        }
    }


    public void WriteFile() {
        write (new AccountGenerator());
    }
//try-with-resources statement
//    public static void write(Account account){
//        try(PrintWriter writer = new PrintWriter(new FileWriter("Accounts.txt")))
//        {
//            writer.println(account.getId() + " | " + account.getHolder() + " | " + account.getAmount());
//        }
//        catch (IOException ex){
//            ex.printStackTrace();
//        }
//    }

    public static void write(AccountGenerator accountgenerator) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Accounts.txt"))) {
            for (int i = 0; i < 10; i++) {
                writer.println(accountgenerator.AccountIdGenerator() + " | " + accountgenerator.AccountNameGenerator() + " | " + accountgenerator.AccountAmountGenerator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Account read() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] arr = str.split("\\|");
                return new Account(String.valueOf(arr[0]), arr[1], Double.parseDouble(arr[2]));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return null;
    }
}