package Homework3.part1_Phone;

public class Main {
    public static void main(String[] args) {
//три экземпляра телефона в классе
//вывести 3 телефона в консоли
        Phone phone1 = new Phone("+79999999999", "Panasonic", 12.2);
        System.out.println("Телефон один: " + "\t" + phone1.getNumber() + " - " + phone1.getModel() + " - " + phone1.getWeight());
        Phone phone2 = new Phone("+79825463258", "Alcatel", 5.2);
        System.out.println("Телефон два: " + "\t" + phone2.getNumber() + " - " + phone2.getModel() + " - " + phone2.getWeight());
        Phone phone3 = new Phone("+79958435687", "Samsung", 3.3);
        System.out.println("Телефон три: " + "\t" + phone3.getNumber() + " - " + phone3.getModel() + " - " + phone3.getWeight());
//отправка сообщений, принт в консоли
        phone2.sendMessage(phone2.getNumber());
// вам звонок
        phone1.receiveCalls("Олег Покатаем Сегодня Шары (БОУЛИНГ!!)", phone1.getNumber());
// Отправка сообщений
        System.out.println();
        phone3.sendMessage(phone2.getNumber(), phone1.getNumber(), phone3.getNumber());
    }
}