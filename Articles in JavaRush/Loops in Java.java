// https://javarush.com/groups/posts/cikly-java
// Циклы в Java. Loops in Java.

// Цикл while
public class Main {
    public static void main(String[] args) {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println("До старта: " + countDown);
            countDown--;
        }
        System.out.println("Поехали!");
    }
}
/* Вывод:
До старта: 10
До старта: 9
До старта: 8
До старта: 7
До старта: 6
До старта: 5
До старта: 4
До старта: 3
До старта: 2
До старта: 1
До старта: 0
Поехали ! */

public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("Строка №" + count);
            if (count>3) {
                break;
            }
            count++; // Без наращивания цикл будет выполняться вечно
        }
    }
}
/* Вывод:
Строка №1
Строка №2
Строка №3
Строка №4 */


// Цикл do..while
public class Main {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("count = " + count);
            count++;
        } while (count < 11);
    }
}
/* Вывод:
count = 1
count = 2
count = 3
count = 4
count = 5
count = 6
count = 7
count = 8
count = 9
count = 10 */


// Цикл for
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Строка №" + i);
        }
    }
}
/*Вывод:
Строка №1
Строка №2
Строка №3
Строка №4
Строка №5 */


// Цикл for each
public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek =
                { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };

        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }
    }
}
/* Вывод:
Понедельник
Вторник
Среда
Четверг
Пятница
Суббота
Воскресенье */
