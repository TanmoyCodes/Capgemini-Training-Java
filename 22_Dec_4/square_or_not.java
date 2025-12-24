import java.util.Scanner;

public class square_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if(length==breadth){
            System.out.println("Its a Square");
        }
        else{
            System.out.println("Its a rectangle");

        }
        sc.close();
    }
}
