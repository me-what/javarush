// https://javarush.com/quests/lectures/questsyntaxpro.level02.lecture03
// Примеры работы со строками. Examples of working with strings

// Task 1
// Логотип решает все. The logo solves everything
public class Solution {
    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2;

        System.out.println(tagline); // JustDoIt
    }
}
/* В переменную tagline нужно записать строку "JustDoIt".
Используй s1, s2, s3 и конкатенацию строк. */



// Task 2
// Пустота и пробелы. Emptiness and gaps
public class Solution {
    public static void main(String[] args) {
        String emptiness = "пустота";

        String fullness = emptiness + " " + emptiness + " " + emptiness;

        System.out.println(fullness); // пустота пустота пустота
    }
}
/* Заполни пробелы пустотой... или наоборот.

Используй переменную emptiness, строки с одним пробелом и конкатенацию строк,
чтобы записать в переменную fullness строку "пустота пустота пустота". */



// Task 3
// Конкатенация строк и чисел. Concatenation of strings and numbers
public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = x + y + "" + z;

        System.out.println(digits); // 60
    }
}
/* В переменную digits нужно записать строку "60".
Используй переменные x, y, z, пустую строку и конкатенацию строк. */



// Task 4
// С каждым разом огромнее. It's getting bigger every time.
public class Solution {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);

        System.out.println(hugeAmount); // 100500
    }
}
/* В переменную hugeAmount нужно записать число 100500.
Используй переменные bigAmount, greatAmount и преобразование строки в число.
Для объявления и инициализации hugeAmount используй одну команду. */



// Task 5
// Получение длины строки. Getting the length of a string
public class Solution {
    public static void main(String[] args) {
        String emptyString = "";

        System.out.println(emptyString.length()); // 0
        System.out.println("Gomu Gomu no Bazooka!".length()); // 21
        System.out.println((emptyString + 2 + 2 + "22").length()); // 4
    }
}
/* В методе main на экран выводятся значения трех строк.
Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки. */



// Task 6
// Причешем резюме. Comb your resume
public class Solution {
    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        System.out.println("RESUME".toLowerCase()); // resume
        System.out.println(("TITLE: " + title).toLowerCase()); // title: senior lead principal software engineer data architect
        System.out.println(("DEGREE: " + degree).toLowerCase()); // degree: in college, i majored in political science and minored in religious studies.
        System.out.println(("CAREER: " + career).toLowerCase()); // career: experienced team leader with strong organizational skills and a successful career in management.
    }
}
/* Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
Внеси изменения в код, чтобы все буквы в этих строках стали строчными. */



// Task 7
// Попрошу регистр на меня не повышать! I will ask you not to raise the register on me!
public class Solution {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        System.out.println(usa.toUpperCase()); // США
        System.out.println("Винни Пух".toUpperCase()); // ВИННИ ПУХ
        System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase()); // IF I TYPE IN CAPS THEY KNOW I MEAN BUSINESS
    }
}
/* В методе main на экран выводятся три строки.
Внеси изменения в код, чтобы все буквы в этих строках стали заглавными. */