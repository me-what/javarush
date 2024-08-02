public class Main {
    public static void main(String[] args) {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('Б');
                } else if (width == 1 || width == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}




//public class Main {
//    public static void main(String[] args) {
//        int a = 0;
//
//        while (a < 10) {
//            int b1 = 0;
//            if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6 || a == 7 || a == 8) {
//                while (b1 < 1) {
//                    System.out.print("Б                  Б");
//                    b1++;
//                }
//            } else {
//                while (b1 < 20) {
//                    System.out.print("Б");
//                    b1++;
//                }
//            }
//            System.out.println();
//            a++;
//        }
//    }
//}



/* Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ */