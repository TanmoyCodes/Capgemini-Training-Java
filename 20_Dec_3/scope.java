import java.util.Scanner;

class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        System.out.println("\n---- User Details ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


    }
}
