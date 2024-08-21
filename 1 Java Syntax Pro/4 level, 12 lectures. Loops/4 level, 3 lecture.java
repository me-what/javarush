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


// Task 3. Второе решение
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


/* Задача 1. Допустим, мы хотим написать программу, которая бы выводила на экран 4 раза слово Мама.
Цикл — это именно то, что нам нужно. И примерно так выглядел бы наш код: */
public class Main {
    public static void main(String[] args) {
        int  n = 0;
        while (n < 4)
        {
            System.out.println("Мама");
            n++;
        }
    }
}// Мама Мама Мама Мама


/* Задача 2. Мы хотим написать программу, которая бы выводила в одну строку 5 букв А.
Для этого нам опять нужен цикл. Вот как будет выглядеть этот код */
public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5)
        {
            System.out.print("A");
            n++;
        } // AAAAA
    }
}


/* Задача 3. Мы хотим вывести на экран прямоугольник из букв А размером в 4 строки и 5 столбцов.
А вот для этого нам уже нужны вложенные циклы. Просто возьмем первый пример, где мы выводим 4 строки и заменим код
по выводу одной строки на код из второго примера. */
public class Main {
    public static void main(String[] args) {
        int n = 0;

        while (n < 4)
        {
            int m = 0;
            while (m < 5)
            {
                System.out.print("А");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}


/* Task 4.
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ */
public class Main {
    public static void main(String[] args) {
        int a = 0;

        while (a<5) {
            int b = 0;

            while (b<10) {
                System.out.print("Q");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}


/* Task 5. Незаполненный прямоугольник
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.

Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ */
// решение 1
public class Main {
    public static void main(String[] args) {
        int a = 0;

        while (a < 10) {
            int b1 = 0;
            if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6 || a == 7 || a == 8) {
                while (b1 < 1) {
                    System.out.print("Б                  Б");
                    b1++;
                }
            } else {
                while (b1 < 20) {
                    System.out.print("Б");
                    b1++;
                }
            }
            System.out.println();
            a++;
        }
    }
}

// решение 2
public class Main {
    public static void main(String[] args) {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('Б');
                } else if (width == 1 || width == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}