package Homework5.Logger;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите, куда записать лог?\t D-DbLogger, \tF-FileLogger, \tC-ConsoleLogger");
        String choose = scanner.nextLine();
        Homework5.Logger.LoggerWriter log = null;

        switch (choose) {
            case "D":
                log = new Homework5.Logger.MakeDbLog();
                break;
            case "F":
                log = new Homework5.Logger.MakeFileLog();
                break;
            case "C":
                log = new Homework5.Logger.MakeConsoleLog();
                break;
            default:
        }
        if (choose != null) {
            Logger logger = log.createLog();
            logger.log();
        }
    }

    int a = 10;
    int b = 5;
    int c;

// начало блока  операций
    public String multiplication() {
        return String.valueOf(c = a * b);
    }

    public String division() {
        if (b != 0) {
            return String.valueOf(c = a / b);
        } else {
            return "На ноль делить нельзя.";
        }
    }

    public String addition() {
        return String.valueOf(c = a + b);
    }

    public String subtraction() {
        return String.valueOf(c = a - b);
    }
//~конец блока операций

    //Получаем результат, который в итоге запишется в getresult и передастся логгерам
    public String getresult() {
        System.out.println("\tПервое число будет " + a + ", а второе " + b + "\nВыберите операцию из списка: \tУмножение (*) \tДеление(/) \tСложение(+) \tВычитание(-)");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        switch (operator) {
            case "*":
                return multiplication();
            case "/":
                return division();
            case "+":
                return addition();
            case "-":
                return subtraction();
        }
        return operator;
    }
}