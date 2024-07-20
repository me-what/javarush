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


// Task 2