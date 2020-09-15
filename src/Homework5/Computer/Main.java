package Homework5.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите в консоль команду и нажмите [Enter]: \n");
        PCassembly assembly = new PCassembly();
        assembly.chooseItem();
        assembly.buildPc();
    }
}
