// https://javarush.com/quests/lectures/questsyntaxpro.level03.lecture01
// Нюансы работы условного оператора. Nuances of the conditional operator

// 1. Последовательность if-ов
public class Main {
    public static void main(String[] args) {
        int temperature = 9;
        if (temperature > 20)
            System.out.println("Надеть рубашку");
        else // тут температура меньше или равна 20
        {
            if (temperature > 10)
                System.out.println("Надеть свитер");
            else // тут температура меньше или равна 10
            {
                if (temperature > 0) // true
                    System.out.println("Надеть плащ");
                else // тут температура меньше 0
                    System.out.println("Надеть пальто");
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int temperature = 9;

        if (temperature > 20)
            System.out.println("надеть рубашку");
        else if (temperature > 10) // тут температура меньше (или равна) 20
            System.out.println("надеть свитер");
        else if (temperature > 0) // true. тут температура меньше (или равна) 10
            System.out.println("надеть плащ");
        else // тут температура меньше 0
            System.out.println("надеть пальто");
    }
}

/* 2. Нюансы else
Важный момент: Если в конструкции if-else не расставлены фигурные скобки,
else относится к предыдущему (ближайшему к нему) if-у. */
public class Main {
    public static void main(String[] args) {
        int age = 59;

        if (age < 60) // true
        {
            if (age > 20) // true
                System.out.println("Надо работать");
            else
                System.out.println("Можно не работать");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int age = 65;

        if (age < 60) // false
            if (age > 20)
                System.out.println("Надо работать");
            else
                System.out.println("Можно не работать");
    }
}
// ничего не выведет


// Task 1. Школа или институт. School or institute.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("нужно ходить в школу");
        } else {
            System.out.println("пора в институт");
        }
    }
}
/* Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт.
Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт!
Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки. */



/* 3. Пример использования оператора if-else
Вывод на экран минимального из двух чисел. Displaying the minimum of two numbers. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);  // создаем объект Scanner
        int a = console.nextInt();  // читаем с клавиатуры первое число
        int b = console.nextInt();  // читаем с клавиатуры второе число
        if (a < b)                   // если a меньше b
            System.out.println(a);     // выводим на экран a
        else                         // иначе
            System.out.println(b);     // выводим на экран b
    }
}
