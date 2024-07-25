import java.util.Scanner;

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