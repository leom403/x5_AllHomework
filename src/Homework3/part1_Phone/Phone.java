package Homework3.part1_Phone;

public class Phone {

    private String number;
    private String model;
    private double weight;

    //контруктор 3 параметра
    public Phone(String number, String model, double weight) {
        //вызов конструктора с 2 параметрами из 3
        this(number, model);                 // должен стоять всегда на 1 месте.
        //конец вызова
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    //конструктор 2 параметра
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //пустой конструктор
    public Phone() {

    }

    //метод ReceiveCalls
    public void receiveCalls() {
        String name = "";
        System.out.println("Вам звонит " + name);
    }

    //перегруженный метод
    public void receiveCalls(String name, String number) {
        System.out.println("Вам звонит " + name + " с телефона: " + getNumber());
    }

    //метод возвращает номер звонящего в перегруженный метод
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    //отправка сообщений
//arg...*name* - обозначение метода переменной длины. Только последний может быть аргументом переменной длины
//каждый варарг является массивом
    public void sendMessage(String... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Сообщение на номер " + number[i] + " отправлено");
        }
    }
}
