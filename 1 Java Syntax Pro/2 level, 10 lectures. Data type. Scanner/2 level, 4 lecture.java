// https://javarush.com/quests/lectures/questsyntaxpro.level02.lecture01
// Операции над переменными типа int

// Task 1
// Полнометражная картина. Full-length picture
public class Solution {
    public static void main(String[] args) {
        int centimeters = 243;
        int meters = centimeters / 100;
        System.out.println(meters);
    }
}
/* В переменной centimeters записано количество сантиметров.
В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
Для вычисления используй переменную centimeters и оператор деления.
Для объявления и инициализации meters используй одну команду. */



// Task 2
// Последняя цифра числа. The last digit of the number
public class Solution {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}
/* В переменной number записано число.
В переменную lastDigit нужно записать последнюю цифру этого числа.
Для вычисления используй переменную number и оператор «остаток от деления».
Для объявления и инициализации lastDigit используй одну команду.

Подсказка: делить нужно на 10. */



// Task 3
// 9-ка это перевернутая 6-ка. 9 is an inverted 6
public class Solution {
    public static void main(String[] args) {
        int six = 6;
        six++;
        six++;
        six++;
        System.out.println(six);
    }
}
/* Используя только оператор инкремента, измени значение в переменной six, чтобы на экран вывелась цифра 9. */



// Task 4
// Когда-то было 32 зуба. Once there were 32 teeth
public class Solution {
    public static void main(String[] args) {
        int toothCounter = 32;

        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;

        System.out.println(toothCounter);
    }
}
/* Используя только оператор декремента, измени значение переменной toothCounter, чтобы на экран вывелось число 23. */
