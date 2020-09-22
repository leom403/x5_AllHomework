package Homework7;

import java.util.*;

public class AccountGenerator {

    public String AccountNameGenerator() {
        List<String> accHolder = Arrays.asList("Chloe", "Max", "BuzzLighter", "Nemo", "Oksana", "Kevin", "Dori", "PonyTail9000", "15427845457", "Hexthon");
        Collections.shuffle(accHolder);
//Добавил несколько чисел для рандома аккаунтов, что бы снизить риск повторения
        List<String> accHolderNumber = Arrays.asList("1", "1542", "3434", "8888", "81", "14", "56", "37", "77", "78", "7488", "3422");
        Collections.shuffle(accHolderNumber);
        return accHolder.get(0) + accHolderNumber.get(0);
    }


    public String AccountIdGenerator() {
        List<String> accID = Arrays.asList("1142", "25412", "65788", "6541", "576578", "97864", "7524", "4525267", "34526754", "4571147", "26516362", "2153251111");
        Collections.shuffle(accID);
        return accID.get(0);
    }

    public int AccountAmountGenerator() {
        return (int) (Math.random() * 1654);
    }

}