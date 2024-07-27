// https://javarush.com/quests/lectures/questsyntaxpro.level03.lecture05
// Сравнение ссылок

public class Main {
    public static void main(String[] args) {
        String text = "Привет";
        String message = text;
        String s1 = text.toUpperCase();
        String s2 = text.toUpperCase();
        System.out.println(text == message); // true  // адреса равны
        System.out.println(text == s1); // false // адреса разные
        System.out.println(s1 == s2); // false // адреса разные
    }
}
/* Переменные message и text хранят адрес (ссылку) одного и того же объекта.
А вот переменные s1 и s2 хранят ссылки на очень похожие объекты, но все-таки не на один и тот же объект. */