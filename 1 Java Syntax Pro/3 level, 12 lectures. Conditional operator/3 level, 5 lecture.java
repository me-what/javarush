// https://javarush.com/quests/lectures/questsyntaxpro.level03.lecture02
// Логический тип boolean. Logical boolean type.

public class Main {
    public static void main(String[] args) {
        int age = 70;
        boolean isSenior = (age > 65);
        if (isSenior)
            System.out.println("Пора на пенсию");
    }
}


// Task 1. Измерим температуру тела. Let's measure the body temperature
import java.util.Scanner;

public class Main {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
/* Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том, что температура тела высокая,
низкая или нормальная, в зависимости от условий.
В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая), в которые нужно
вынести соответствующие условия и вместо выражений сравнения использовать эти переменные. */



// Task 2. Три числа. Three numbers
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit_1 = scanner.nextInt();
        int digit_2 = scanner.nextInt();
        int digit_3 = scanner.nextInt();

        boolean dig_1_2_3 = digit_1 == digit_2 && digit_1 == digit_3;
        boolean dig_1_2 = digit_1 == digit_2;
        boolean dig_1_3 = digit_1 == digit_3;
        boolean dig_2_3 = digit_2 == digit_3;

        if (dig_1_2_3) {
            System.out.println(digit_1 + " " + digit_2 + " " + digit_3);
        } else if (dig_1_2) {
            System.out.println(digit_1 + " " + digit_2);
        } else if (dig_1_3) {
            System.out.println(digit_1 + " " + digit_3);
        } else if (dig_2_3) {
            System.out.println(digit_2 + " " + digit_3);
        }
    }
}
/* Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2
b) при вводе чисел 2 2 2 получим вывод 2 2 2 */