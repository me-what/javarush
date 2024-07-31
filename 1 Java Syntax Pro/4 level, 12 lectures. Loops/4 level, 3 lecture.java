// https://javarush.com/quests/lectures/questsyntaxpro.level04.lecture00
// Циклы в Java

// 1
public class Main {
    public static void main(String[] args) {
        int  n = 5;
        while (n > 0)
        {
            System.out.println(n);
            n--;
        }
    }
}
// 5
//4
//3
//2
//1


// 2
public class Main {
    public static void main(String[] args) {
        int  n = 0;
        while (n < 10)
        {
            System.out.println(n);
            n++;
        }
    }
}
// 0 1 2 3 4 5 6 7 8 9


// 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(console.hasNextInt())
        {
            int x = console.nextInt();
        }
    }
}
/* Программа считывает с клавиатуры числа до тех пор, пока вводят именно числа. */


// 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
            String s = console.nextLine();
            isExit = s.equals("exit");
        }
    }
}
/* Программа будет вводить строки с клавиатуры,
пока не будет введена строка exit. */


// Task 1. Я никогда не буду работать за копейки
/* Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»

Каждое значение вывести с новой строки. */
public class Main {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int i = 0;
        while (i<100) {
            System.out.println(quote);
            i++;
        }
    }
}


// Task 2. Все любят Мамбу
/* Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 0;

        while (i<10) {
            System.out.println(name + text);
            i++;
        }
    }
}


// Task 3. Суммирование. Summation
/* Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String str = reader.readLine();
            if ("ENTER".equals(str)) {
                System.out.println(sum);
                break;
            } else {
                sum += Integer.parseInt(str);
            }
        }
    }
}

// Task 3. Второе решение
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}