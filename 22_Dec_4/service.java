import java.util.Scanner;

public class service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your service year: ");
        int service_year = sc.nextInt();

        System.out.println("Enter your Sal: ");
        double sal = sc.nextInt();

        if (service_year > 5) {
            double bonus = sal * (0.05);
            sal += bonus;
        }
        System.out.println(sal);
    }
}
