import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int fact = 1;
        do {
            fact = fact * num;
            num--;
        } while (num > 0);
        System.out.println(fact);
        System.out.println("Do u want to continue?");

        char input = sc.next().charAt(0);
        if (input == 'y') {
            main(new String[0]);
        }
    }

}
