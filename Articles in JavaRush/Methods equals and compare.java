// https://javarush.com/groups/posts/equals-java-sravnenie-strok
// Equals в Java и String compare - Сравнение строк

// 1
public class Car {
    String model;
    int maxSpeed;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Ferrari";
        car1.maxSpeed = 300;

        Car car2 = new Car();
        car2.model = "Ferrari";
        car2.maxSpeed = 300;

        System.out.println(car1 == car2); // false
    }
} /* Так, стоп. А почему, собственно, эти две машины не равны? Мы задали им одинаковые свойства, но результат сравнения — false.

Ответ прост. Оператор == сравнивает не свойства объектов, а ссылки. Будь у двух объектов даже 500 одинаковых свойств,
результатом сравнения все равно будет false. Ведь ссылки car1 и car2 указывают на два разных объекта, на два разных адреса. */


// 2
public class Man {
    int dnaCode;

    public boolean equals(Man man) {
        return this.dnaCode ==  man.dnaCode;
    }

    public static void main(String[] args) {
        Man man1 = new Man();
        man1.dnaCode = 1111222233;

        Man man2 = new Man();
        man2.dnaCode = 1111222233;

        System.out.println(man1.equals(man2)); // true
    }
} /* Совсем другой результат! Написав свой метод equals() вместо стандартного, мы добились правильного поведения:
теперь если у двух людей одинаковый код ДНК, программа говорит нам: “Анализ ДНК показал, что это близнецы” и возвращает true!

Переопределяя метод equals() в своих классах, ты можешь легко создавать нужную логику сравнения объектов.  */


// 3. String compare в Java - Сравнение строк
// оператор сравнения == сравнивает ссылки на объект
public class Main {

    public static void main(String[] args) {
        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = "JavaRush - лучший сайт для изучения Java!";
        String s3 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1==s2); // true //ссылки s1 и s2 указывают на один и тот же объект (адрес)
        System.out.println(s1==s3); // false //ссылки s1 и s3 указывают на два разных объекта (адреса)
    }
}


// 4. Метод equals()
// метод equals() сравнивает строки по содержанию
public class Main {
    public static void main(String[] args) {
        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1.equals(s2)); // true // хотя адреса разные
    }
}


// 5
public class Main {
    public static void main(String[] args) {
        String address1 = "г. Москва, ул. Академика Королева, дом 12";
        String address2 = new String("Г. МОСКВА, УЛ. АКАДЕМИКА КОРОЛЕВА, ДОМ 12");
        System.out.println(address1.equalsIgnoreCase(address2)); // true
    }
}


// 6. Метод String.intern()
/* У класса String есть еще один хитрый метод — intern();

Метод intern() напрямую работает со String Pool’ом. Если ты вызываешь метод intern() у какой-то строки, он:
Смотрит, есть ли строка с таким текстом в пуле строк
Если есть — возвращает ссылку на нее в пуле
Если же нет — помещает строку с этим текстом в пул строк и возвращает ссылку на нее.
Применив метод intern() к ссылке на строку, которая создавалась через new, мы можем сравнивать ее со ссылкой на строку
из String Pool’a через оператор ==. */
public class Main {
    public static void main(String[] args) {
        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1 == s2.intern()); // true
    }
}

/* Для сравнения строк ВСЕГДА используй метод equals()! Сравнивая строки, ты почти всегда имеешь в виду сравнение их
текста, а не ссылок, областей памяти и прочего.

Метод equals() делает именно то, что тебе нужно. */