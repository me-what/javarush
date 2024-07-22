import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        double a = 1.000001;
//        double b = 1.000002;
//
//        if ( Math.abs(b - a) < 0.0001 )
//            System.out.println("Числа равны");
//        else
//            System.out.println("Числа не равны");


        Scanner scanner = new Scanner(System.in);
        double digit1 = scanner.nextDouble();
        double digit2 = scanner.nextDouble();

        if (Math.abs(digit2-digit1) < 0.0001) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }

    }
}
