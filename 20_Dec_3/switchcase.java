import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter Num 1: ");
        int num1 = num.nextInt();
        System.out.println("Num1 is : " + num1);
        System.out.print("Enter Num 2: ");
        int num2 = num.nextInt();
        System.out.println("Num 2 is : " + num2);

        System.out.println("Enter the operation (+, -, *, /)");
        String ch = num.next();


        switch (ch){

            case "+" :
            {
                int sum = num1+num2;
                System.out.println("The sum is : " + sum);
                break;
            }

            case "-" :
            {
                int sum = num1-num2;
                System.out.println("The sub is : " + sum);
                break;
            }
            case "*" :
            {
                int sum = num1*num2;
                System.out.println("The mul is : " + sum);
            }
            case "/" :
            {
                int sum = num1/num2;
                if(num1<num2){
                    System.out.println("Num 1 is Greater than num 2");
                    break;
                }
                System.out.println("The div is : " + sum);

            }
        }
    }
}