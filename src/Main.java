import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s+"\n");


        // 2
        /* Нет проверки. Будет ошибка, если ввести не число, а строковое значение.
        Поэтому нужна проверка */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number);
        System.out.println();


        // 3
        // Сканер с проверкой
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");

        if (scan.hasNextInt()) {
            int number_n = scan.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number_n);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
        System.out.println();


        // 4
        Scanner scan_s = new Scanner("На голой ветке'" +
                "Ворон сидит одиноко.'" +
                "Осенний вечер." +
                "''***''" +
                "В небе такая луна,'" +
                "Словно дерево спилено под корень:'" +
                "Белеет свежий срез." +
                "''***''" +
                "Как разлилась река!'" +
                "Цапля бредет на коротких ножках,'" +
                "По колено в воде.");

        scan_s.useDelimiter("'");

        while (scan_s.hasNext()) {
            System.out.println(scan_s.next());
        }

        scan_s.close();
        /*
На голой ветке
Ворон сидит одиноко.
Осенний вечер.

***

В небе такая луна,
Словно дерево спилено под корень:
Белеет свежий срез.

***

Как разлилась река!
Цапля бредет на коротких ножках,
По колено в воде. */
    }
}


/*
В этом же примере есть еще один метод, на который нужно обязательно обратить внимание — close().
Как и любой объект, работающий с потоками ввода-вывода, сканер должен быть закрыт по завершении своей работы,
чтобы больше не потреблять ресурсы нашего компьютера.

Никогда не забывай о методе close()! */