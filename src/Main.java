/* Призывная компания.
Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры. */

import java.util.Scanner;

// Сокращенная форма оператора if. The abbreviated form of the if statement
public class Main {
    public static void main(String[] args){
        int age = 18;
        if (age == 18)
        {
            System.out.println("Вы уже взрослый");
        }

        if (age == 18)
            System.out.println("Вы уже взрослый");
    }
}