// https://javarush.com/groups/posts/for-v-java
// Цикл For в Java

public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Main main = new Main();
        main.printAllElements(daysOfWeek);
    }
    public void printAllElements(String[] stringArray) {
        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Main main = new Main();
        main.printAllElements(daysOfWeek);
    }

    public void printAllElements(String[] stringArray) {
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}



   for(int i = 5; i > 0; i--) {
        System.out.println(i);
}



int a = 0;
for(int i = 5; i > 0; i--, a++) {
        System.out.print("Шаг: " + a + " Значение: ");
   System.out.println(i);
}



        for(int i = 5, j = 11; i != j; i++, j--) {
        System.out.println("i: " + i + " j: " + j);
}



        for(int i = 0; i < 5; i++) {
        System.out.print(i + " | ");
            for(int j = 0; j < 5; j++) {
        System.out.print(j + " ");
            }
                    System.out.print('\n');
}



int[][] array = { {0, 1, 2, 3, 4 },
        {1, 2, 3, 4, 5},
        {2, 3, 4, 5, 6},
        {3, 4, 5, 6, 7}};

for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
   }
           System.out.print('\n');
}



public class Main {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "Jeronimo"};
        getFirstPosition(array, "two");
    }

    public static void getFirstPosition(String[] stringArray, String element) {
        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals(element)) {
                System.out.println(i);
                break;
            }
        }
    }
}

