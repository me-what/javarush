// Ввод с клавиатуры. Keyboard input

// task 1
// Чтение и преобразование строк
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string_1 = console.nextLine();
        String string_2 = console.nextLine();
        String string_3 = console.nextLine();

        System.out.println(string_3);
        System.out.println(string_2.toUpperCase());
        System.out.println(string_1.toLowerCase());
    }
}


// task 2
// Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int digit_1 = console.nextInt();
        int digit_2 = console.nextInt();
        int digit_3 = console.nextInt();

        // am (arithmetic mean) - сред.арифметическое
        int am = (digit_1 + digit_2 + digit_3) / 3;
        System.out.println(am);
    }
}


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