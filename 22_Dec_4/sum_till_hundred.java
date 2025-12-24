import java.util.Scanner;

public class sum_till_hundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 1;
        do{
            int num = sc.nextInt();
            sum+=num;
            if(sum>100){
                
                break;
            }
            i++;

        }
        while(sum<100);
        System.out.println(sum);
        System.out.println(i);
    }
}
