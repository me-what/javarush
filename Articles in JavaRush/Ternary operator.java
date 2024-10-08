// Тернарный оператор в Java
// https://javarush.com/groups/posts/ternarnyj-operator

// Без тернарного оператора
public class Main {
    public static void main(String[] args) {
        Man man = new Man(22);
        String securityAnswer;

        if (man.getAge()>=18) {
            securityAnswer = "Все в порядке, проходите!";
        } else {
            securityAnswer = "Этот фильм не подходит для вашего возраста!";
        }
        System.out.println(securityAnswer);
    }
}

class Man {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Вывод в консоль:
//     "Все в порядке, проходите!"



// 2. С использованием тернарного оператора
public class Main {
    public static void main(String[] args) {
        Man man = new Man(22);
        String securityAnswer = (man.getAge()>=18)? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";
        System.out.println(securityAnswer);
    }
}

class Man {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// Вывод в консоль:
//     "Все в порядке, проходите!"