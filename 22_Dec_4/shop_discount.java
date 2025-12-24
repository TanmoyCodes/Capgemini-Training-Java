import java.util.Scanner;

public class shop_discount {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int no_tshirt = sc.nextInt();
        System.out.println("Enter number of T-Shirts, Each costs 200");
        int total = no_tshirt*200;

        if(total>1000){
            System.out.print("Total is more than 1000, Discount of ten percent applied. Total bill :");
            int discount = total/10;
            total -=discount;
        }
        System.out.println(total);
    }
}
