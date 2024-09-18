// https://javarush.com/quests/lectures/questsyntaxpro.level02.lecture05
// Ввод с клавиатуры. Keyboard input

// Task 1
// Чтение и преобразование строк. Reading and converting strings
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string_1 = scanner.nextLine();
        String string_2 = scanner.nextLine();
        String string_3 = scanner.nextLine();

        System.out.println(string_3);
        System.out.println(string_2.toUpperCase());
        System.out.println(string_1.toLowerCase());
    }
}
/* Считай с клавиатуры три строки.
А затем:

Выведи на экран третью строку в неизменном виде.
Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
Пример ввода:

Строка Номер РАЗ
Вторая строка
Строка 3
Пример вывода:

Строка 3
ВТОРАЯ СТРОКА
строка номер раз */



// Task 2
// Чтение чисел. Reading numbers
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number_1 = console.nextInt();
        int number_2 = console.nextInt();
        int number_3 = console.nextInt();

        // am (arithmetic mean) - сред.арифметическое
        int am = (number_1 + number_2 + number_3) / 3;
        System.out.println(am);
    }
}
/* Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:
51
101
201

Пример вывода:
117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка. */



// Class Scanner
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = console.nextLine();
        System.out.println("Введите возраст: ");
        int age = console.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Scanner
import java.util.Scanner;
public class Solution {
    public static void main(String[] args)
    {
        String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b); // 30
    }
}