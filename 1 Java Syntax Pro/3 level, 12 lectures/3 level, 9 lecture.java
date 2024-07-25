// https://javarush.com/quests/lectures/questsyntaxpro.level03.lecture06
// Сравнение строк по содержанию

/* Это все отлично. Но вы же видите, что строки s1 и s2 фактически одинаковые – они содержат одинаковый текст.
Как сказать программе, чтобы при сравнении строк она смотрела не на адреса объектов String, а на их содержимое?

Для этого в Java у типа String есть специальный метод — equals */
public class Main {
    public static void main(String[] args) {
        String s1 = "Привет"; // Привет
        String s2 = "ПРИВЕТ"; // ПРИВЕТ
        String s3 = s1.toUpperCase(); // ПРИВЕТ

        System.out.println(s1.equals(s2)); // false // разные
        System.out.println(s1.equals(s3)); // false // разные
        System.out.println(s2.equals(s3)); //  true  // одинаковые, хотя адреса разные
        System.out.println();

        System.out.println("Привет".equals("ПРИВЕТ")); // false

        String s = "Привет";
        System.out.println("Привет".equals(s)); // true

        String st2 = "При";
        System.out.println("Привет".equals(st2 + "вет")); // true

        String st3= "П";
        System.out.println((st3 + "ривет").equals(st3 + "ривет")); // true
    }
}


// Task 1. Сравним строки
/* Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (s1.equals(s2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}


// Task 2. Сравнение строк по ссылке
/* В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3 с выводом соответствующего
сообщения после каждого сравнения:
"ссылки на строки одинаковые" или "ссылки на строки разные".

Порядок сравнения должен быть следующим:
- строку string1 со строкой string2
- строку string2 со строкой string3
- строку string1 со строкой string3. */
public class Main {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        if (string1==string2) { // true
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string2==string3) { // false
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string1==string3) { // false
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}