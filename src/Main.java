public class Main {
    public static void main(String[] args) {


        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y; //14

        x = y - x; // 12 = 14 - 2
        y = y - x; // 2 = 14 - 12

        System.out.println(x);
        System.out.println(y);
    }
}