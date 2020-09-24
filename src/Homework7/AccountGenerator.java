package Homework7;

import java.util.*;

public class AccountGenerator {

    public String AccountNameGenerator() {
        List<String> accHolder = Arrays.asList("Chloe", "Max", "BuzzLighter", "Nemo", "Oksana", "Kevin", "Dori", "Askakhova", "", "Hexthon");
        Collections.shuffle(accHolder);
//Добавил несколько чисел для рандома аккаунтов, что бы снизить риск повторения
        List<String> accHolderNumber = Arrays.asList("1", "1542", "3434", "8888", "81", "14", "56", "37", "77", "78", "7488", "3422");
        Collections.shuffle(accHolderNumber);
        return accHolder.get(0) + accHolderNumber.get(0);
    }


    public int AccountIdGenerator() {
        Random rndm = new Random();
        int znach = 0;
        do {
            znach = (int)(rndm.nextDouble()*9999);
        } while (znach < 1000);
        return znach;
    }

    public int AccountAmountGenerator() {
        return (int) (Math.random() * 1654);
    }

}