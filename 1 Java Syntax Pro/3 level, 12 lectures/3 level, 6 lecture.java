// https://translate.yandex.ru/?utm_source=main_stripe_big&source_lang=ru&target_lang=en&text=%D0%9B%D0%BE%D0%B3%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B5%20%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8
// Логические операции. Logical operations

// Task 1
/* Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
Для этого тебе нужно:
Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
То есть, тебе нужно выполнить три сравнения:

Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других,
то треугольника с такими сторонами не существует. */

import java.util.Scanner;

public class Main {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side_a = scanner.nextInt();
        int side_b = scanner.nextInt();
        int side_c = scanner.nextInt();

        boolean triangle_exists = side_a < side_b + side_c && side_b < side_a + side_c && side_c < side_a + side_b;
        boolean triangle_not_exists = side_a >= side_b + side_c || side_b >= side_a + side_c || side_c >= side_a + side_b;

        if (triangle_not_exists) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        } else if (triangle_exists) {
            System.out.println(TRIANGLE_EXISTS);
        }
    }
}
// Если ввести с клавиатуры допустим длину треуголтнка A B C 2 3 4, то треугольник существует


/* 2. Примеры использования операторов сравнения и булевых переменных */
public class Main {
    public static void main(String[] args) {
        int age = 35;
        if (age >= 18 && age <= 65) // true
            System.out.println("Вы можете работать");

        int age_2 = 35;
        boolean isYoung = (age_2 < 18);
        if (!isYoung && age_2 <= 65) // true
            System.out.println("Вы можете работать");

        int age_3 = 35;
        boolean isYoung_3 = (age_3 < 18);
        boolean isOld = (age_3 > 65);
        if (!isYoung_3 && !isOld) // true
            System.out.println("Вы можете работать");
    }
}


// Task 2. Работать или не работать - вот в чем вопрос
/* Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
то выводить ничего не нужно, иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!) с помощью только
одного оператора if без else.

Подсказка: используй логический оператор "||" (или). */