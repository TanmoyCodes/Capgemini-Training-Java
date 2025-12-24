import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        
        int sum = 0;
        // for(int i = 0; i<=input; i++){
        //     int num = sc.nextInt();
        //     if(num<0){
        //         System.out.println(sum);
        //         break;
        //     }
        //     sum+=num;

        // }

        int num;
        do{
            num = sc.nextInt();
            if(num<0){
               System.out.println(sum);
                 break;
             }
             sum+=num;
        }
        while(true);
             
        
    }
}
