// https://javarush.com/groups/posts/2020-vvod-vihvod-v-java-klassih-fileinputstream-fileoutputstream-bufferedinputstream
// Ввод-вывод в Java. Классы FileInputStream, FileOutputStream, BufferedInputStream

// 1
import java.io.*;

// Главное назначение класса FileOutputStream — запись байтов в файл.
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\test10.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file); // запись

        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";

        fileOutputStream.write(greetings.getBytes());


// У класса FileInputStream назначение противоположное — чтение байтов из файла. Так же как FileOutputStream наследует
// OutputStream, этот класс происходит от абстрактного класса InputStream.
        FileInputStream fileInputStream = new FileInputStream("D:\\test10.txt"); // чтение
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i); // Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!
            fileOutputStream.close();
        }
    }
}


// 2
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\test10.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;

        while((i = bufferedInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }
}


// 3
import java.io.*;
        import java.util.Date;
public class Main {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        FileInputStream fileInputStream = new FileInputStream("D:\\test10.txt");

        int i;

        while((i = fileInputStream.read())!= -1){
            System.out.print((char)i);
        }

        Date date1 = new Date();
        System.out.println((date1.getTime() - date.getTime()));
    }
}


// 4
public class Main {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Username\\Desktop\\textBook.rtf");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i;

        while((i = bufferedInputStream.read())!= -1){
            System.out.print((char)i);
        }

        Date date1 = new Date();
        System.out.println((date1.getTime() - date.getTime()));
    }
}