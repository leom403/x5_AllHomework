package Homework7;

import java.io.*;


public class CheckFile {
    private static File file = new File("Accounts.txt");

    public CheckFile() {
        if (!file.exists()) {
            WriteFile();
        }
    }

    public Account get(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
            String str;
            String[] accountDevide;
            Account account = null;
            while ((str = reader.readLine()) != null) {
                if (str.startsWith(String.valueOf(id))) {
                    break;
                }
            }
            if (str != null) {
                accountDevide = str.split("\\|");
                account = new Account(String.valueOf(accountDevide[0]), accountDevide[1], Double.parseDouble(accountDevide[2]));
            }
            return account;
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void WriteFile() {
        write(new AccountGenerator());
    }
//try-with-resources statement
    public static void write(AccountGenerator accountgenerator) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Accounts.txt"))) {
            for (int i = 0; i < 10; i++) {
                writer.println(accountgenerator.AccountIdGenerator() + " | " + accountgenerator.AccountNameGenerator() + " | " + accountgenerator.AccountAmountGenerator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
