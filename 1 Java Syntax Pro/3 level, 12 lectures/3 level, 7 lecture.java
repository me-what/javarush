// https://javarush.com/quests/lectures/questsyntaxpro.level03.lecture04
// Лайфхаки: как писать код лучше и быстрее

int age = 25;
int money;
        if (age > 30)
money = 100;
        else
money = 50;
        System.out.println(money); // 50


int age2 = 25;
int money2 = age2 > 30 ? 100 : 50;
        System.out.println(money2); // 50


// Task 1. Ищем максимум
/* У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
Если числа одинаковые, то выводится любое.
Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений. */
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                int result = number1>number2 ? number1 : number2;
                System.out.println(result);
        }
}


// Task 2. Через тернии...
/* Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
Перепиши программу без использования тернарного оператора. */
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();

                if (number < 5) {
                        System.out.println("число меньше 5");
                } else if (number>5) {
                        System.out.println("число больше 5");
                } else {
                        System.out.println("число равно 5");
                }
        }
}


// Task 3. Высокая точность
/* Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
равны ли эти числа с точностью до одной миллионной. */