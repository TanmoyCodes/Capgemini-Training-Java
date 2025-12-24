import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 00;

        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 40;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("----------------------------");
        int[] ar = { 30, 40, 10, 20, 50 };
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arrr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("Enter the " + i + "th elememt: ");
            arrr[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }
}
