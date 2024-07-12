// Лучший курс по основам программирования. The best course on the basics of programming

// 1-я задача
// Комментарии излишни
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

// 2-я задача
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