// https://javarush.com/quests/lectures/questsyntaxpro.level03.lecture00
// Условный оператор. Conditional operator

// Пример if-else без кодового блока. Example if-else without a code block
int age = 17;
        if(age<18)
        System.out.println("Вы еще ребенок");
        else
        System.out.println("Вы уже взрослый");
        System.out.println();

        int temperature = 5;
        if (temperature<0)
        System.out.println("На улице мороз");
        else
        System.out.println("На улице тепло");


// Task 1. Считывание с клавиатуры температуру воздуха
/* Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно",
иначе - вывести надпись "на улице тепло". */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature<0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }
}


// Task 2. Призывная компания.
/* Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28)
            System.out.println(name + militaryCommissar);
    }
}


// Example if-else with a code block. Пример if-else с кодовым блоком { }
public class Main {
    public static void main(String[] args){
        int age = 17;
        if (age < 18)
        {
            System.out.println("Ты еще ребенок");
            System.out.println("Не спорь со взрослыми");
        }
        else
        {
            System.out.println("Вы уже взрослый");
            System.out.println("Ну и молодежь пошла");
        }

        int temperature = 5;
        if (temperature < 0)
        {
            System.out.println("На улице мороз");
            System.out.println("Шапку надень");
        }
        else
            System.out.println("Тепло");
    }
}

// Сокращенная форма оператора if. The abbreviated form of the if statement
public class Main {
    public static void main(String[] args){
        int age = 18;
        if (age == 18)
        {
            System.out.println("Вы уже взрослый");
        }

        if (age == 18)
            System.out.println("Вы уже взрослый");
    }
}