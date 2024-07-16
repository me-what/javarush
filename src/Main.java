import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        char A = 65;
        System.out.println(A); // A

//        InputStreamReader reader = new InputStreamReader(System.in); // Считывание символов с клавиатуры
//        while (true) {
//            int x = reader.read();
//            System.out.println(x);
//        }

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            System.out.println("Мы считали с клавиатуры эту строку:");
            System.out.println(s);
    }
}
