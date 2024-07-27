public class Main {

    public static void main(String[] args) {

        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}