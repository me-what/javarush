import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        boolean isYoung = age <= 20 || age >= 60;
        boolean isOld = (age > 20 || age <= 60);

        if (isYoung || !isOld) {
            System.out.println("можно не работать");
        }
    }
}
