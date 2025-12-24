import java.util.Scanner;

public class password_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 1;
        int password = 4444;
        do{
            int input = sc.nextInt();
            if(input==password){
                System.out.println("Correct Password");
                break;
            }


            else{
                System.out.println("Wrong Password");
                count++;
            }

        }
        while(count<=3);
    }
}
