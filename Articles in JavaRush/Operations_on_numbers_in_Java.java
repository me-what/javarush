// https://javarush.com/groups/posts/1924-operacii-nad-chislami-v-java
// Операции над числами в Java. Operations on numbers in Java

public class Main {
    public static void main(String[] args) throws IOException {
        int x = 999;
        int y = 33;
        int a = 33%2;
        int b = 10;
        int c = 30;
        int z = 256;

        System.out.println(a); // 1
        System.out.println(x+y); // 1032
        System.out.println(x-y); // 966
        System.out.println(x*y); // 32967
        System.out.println(x/y); // 30
        System.out.println(x==y); // false
        b = c = z;
        System.out.println(b); // 256
        System.out.println();

        // Унарные операции. Unary operations.
        // унарный минус. unary minus
        int uno = 100;
        uno = -uno;
        System.out.println(uno); // - 100
        uno = -uno;
        System.out.println(uno); // 100
        System.out.println();

        // Постфиксные и префиксные операторы
        // постинкремент x++
        int d = 999;
        d++;
        System.out.println(d);

        // постдекремент x--
        d--;
        System.out.println(d);

        System.out.println();

        // Логические операторы.
        // Логическое И &&
        System.out.println(100 > 10 && 100 > 200); // false
        System.out.println(100 > 50 && 100 >= 100); // true
        System.out.println();

        // Логическое НЕ (NOT) !
        boolean bx = true;
        System.out.println(!bx); // false

        // Логическое ИЛИ ||
        System.out.println(100 > 10 || 100 > 200); // true

    }
}