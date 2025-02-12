// https://javarush.com/groups/posts/1876-operator-while
// Цикл While в Java. While loop in Java

public static void main(String[] args) {
    int number = 3;
    int result = 1;
    int power = 1;
    while(power <= 10) {
        result = result * number;
        System.out.println(number + " в степени " + power + " = " + result);
        power++;
    }
}



public static void main(String[] args) {
    int number = 3;
    int result = number;
    int power = 1;
    do {
        System.out.println(number + " в степени " + power + " = " + result);
        power++;
        result = result * number;
    } while (result < 10000);



    public class Main {
        public static void main(String[] args) {
            int sum = 0;
            int i = 0;
            int count = 20;
            while(i<=count) {
                i++;
                if (i*i<=count)
                    continue;
                sum += i*i*i;
            }
            System.out.println(sum);
        }
    }



    public class Main {
        public static void main(String[] args) {
            int number = 3;
            int result = 1;
            int power = 1;
            while(true) {
                result = result * number;
                System.out.println(number + " в степени " + power + " = " + result);
                power++;
                if (power>10)
                    break;
            }
        }
    }



    public class Main {
        public static void main(String[] args) {
            System.out.println("    2  3  4  5  6  7  8  9");
            int i = 2;
            while(i<10) {
                System.out.print(i + " | ");
                int j = 2;
                while (j<10) {
                    int mul=i*j;
                    if (mul<10)
                        System.out.print(mul + "  ");
                    else
                        System.out.print(mul + " ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
