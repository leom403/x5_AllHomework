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
