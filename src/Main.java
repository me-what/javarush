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