// https://javarush.com/groups/posts/2136-ustroystvo-vejshestvennihkh-chisel
// Устройство вещественных чисел. The device of real numbers

public class Main {
    public static void main(String[] args) {
        float f = 0.0f;
        for (int i = 1; i <= 7 ; i++) {
            f += 0.1111111111111111;
        }
        System.out.println(f);
    }
}


public class Main {
    public static void main(String[] args) {
        final double threshold = 0.0001;

        double f1 = .0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }
        double f2 = .1 * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (Math.abs(f1 - f2) < threshold)
            System.out.println("f1 и f2 равны");
        else
            System.out.println("f1 и f2 не равны");
    }
}


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal(0.0);
        BigDecimal pointOne = new BigDecimal(0.1);
        for (int i = 1; i <= 11; i++) {
            f1 = f1.add(pointOne);
        }

        BigDecimal f2 = new BigDecimal(0.1);
        BigDecimal eleven = new BigDecimal(11);
        f2 = f2.multiply(eleven);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        
        if (f1.compareTo(f2) == 0)
            System.out.println("f1 и f2 равны");
        else
            System.out.println("f1 и f2 не равны");
    }
}
