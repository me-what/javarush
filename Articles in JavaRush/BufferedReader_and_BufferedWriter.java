// https://javarush.com/groups/posts/593-bufferedreader-i-bufferedwritter
// BufferedReader и BufferedWriter

import java.io.*;

// Считываем данные с консоли и записываем в файл:
public class Main {
    public static void main(String[] args) {
        String outputFileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}