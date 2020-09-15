package Homework2;/* Я долго бился, как заставить это все работать в одном коде и не придумал ничего лучше, чем
 * вводить постепенно новые переменные. Из-за этого их аж 8
 */

import java.util.Arrays;
import java.util.Collections;

public class Homework2_part8 {
    public static void main(String[] args) {
        int[] numb = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2}; //-92(5) и 170(9 с нулем) -- 78(14) - сумма отриц и полож
        System.out.println("Дан массив чисел: {" + numb + "}");

        int max = 0;
        int sum = 0;
        int pos = 0;
        int evenNeg = 0;
        int sumNeg = 0;
        int quanPos = 0;
        double average = 0;
        int negAv = 0;
        int sumAllNeg = 0;

        //макс
        for (int i = 0; i < numb.length; i++) {
//сумм полож эл + кол-во положительных эл
            if (numb[i] > max){
                max = numb[i];
            }
            if (numb[i] > 0) {
                sum += numb[i];
                pos++;
                quanPos++;
            }
// сумм отрицательныъ элементов + среднее арифметическое отриц элементов.
            else if (numb[i] < 0) {
                sumAllNeg += numb[i];                     //78 - сумма отриц и полож -- 92/5=18.4
                negAv++;
                average = ((double) sumAllNeg / negAv);       // на заметку. В правой части инт, необходимо объявить их, как double.
//Начало вложенной проверки
                if (numb[i] < 0 && numb[i] % 2 == 0) {
                    evenNeg += numb[i];
                    sumNeg++;
                }
//конец вложенной проверки
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма (+) элементов: " + sum);
        System.out.println("Сумма чётных (-) элементов: " + evenNeg);
        System.out.println("Количество положительный элементов: " + quanPos);
        System.out.println("Среднее арифметическое (-) элементов: " + average);

    }
}