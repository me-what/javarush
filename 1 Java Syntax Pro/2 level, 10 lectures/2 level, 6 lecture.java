// task 1
public class Solution {
    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2;

        System.out.println(tagline); // JustDoIt
    }
}

// task 2
public class Solution {
    public static void main(String[] args) {
        String emptiness = "пустота";

        String fullness = emptiness + " " + emptiness + " " + emptiness;

        System.out.println(fullness); // пустота пустота пустота
    }
}

// task 3
public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = x + y + "" + z;

        System.out.println(digits); // 60
    }
}


// task 4
public class Solution {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);

        System.out.println(hugeAmount); // 100500
    }
}


// task 5
// Получение длины строки
public class Solution {
    public static void main(String[] args) {
        String emptyString = "";

        System.out.println(emptyString.length()); // 0
        System.out.println("Gomu Gomu no Bazooka!".length()); // 21
        System.out.println((emptyString + 2 + 2 + "22").length()); // 4
    }
}


// task 6
public class Solution {
    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        System.out.println("RESUME".toLowerCase()); // resume
        System.out.println("TITLE: ".toLowerCase() + title.toLowerCase()); // title: senior lead principal software engineer data architect
        System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase()); // degree: in college, i majored in political science and minored in religious studies.
        System.out.println("CAREER: ".toLowerCase() + career.toLowerCase()); // career: experienced team leader with strong organizational skills and a successful career in management.
    }
}


// task 7
public class Solution {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        System.out.println(usa.toUpperCase()); // США
        System.out.println("Винни Пух".toUpperCase()); // ВИННИ ПУХ
        System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase()); // IF I TYPE IN CAPS THEY KNOW I MEAN BUSINESS
    }
}
