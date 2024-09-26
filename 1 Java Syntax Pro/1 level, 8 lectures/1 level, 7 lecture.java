// https://javarush.com/quests/lectures/questsyntaxpro.level01.lecture07
// Лучший курс по основам программирования. The best course on the basics of programming

// Task 1
// Комментарии излишни. Comments are unnecessary
public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
/* Раскомментируй одну строчку, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2). */



// Task 2
/*
2 + 3 = 5
*/

public class Solution {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        //    System.out.print("два");
        System.out.print(b);
        System.out.print(" плюс ");
        //  System.out.print(" минус ");
        System.out.print(a);
        //    System.out.print("три");
        System.out.print(" равно ");
        //    System.out.print(" будет ");
        //    System.out.print("пять");
        System.out.print(a + b);
    }
}
/* Закомментируй ненужные строки кода, чтобы на экран вывелась надпись:
2 плюс 3 равно 5
Примечание: комментировать строки с объявлением переменных int a и int b нельзя. */