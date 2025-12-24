import java.util.Scanner;
import java.lang.Character;

import static java.lang.Character.isUpperCase;

public class evenOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter Num 1: ");
        int num1 = num.nextInt();
        System.out.println("Num1 is : " + num1);

        String res = (num1%2==0) ? "Even":"Odd";
        System.out.println(res);

        String rss = (num1%5 == 0 && num1%11 == 0 ) ? "Divisible" : "Not Divisible";


        char name = 'T';
        boolean alpha = Character.isUpperCase(name);
        System.out.println(alpha);

    }
}