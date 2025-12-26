import java.util.*;
public class second_max {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 3, 4, 7, 8, 9, 90};
        int size = arr.length;


        Arrays.sort(arr);
        System.out.println(arr[1]+","+arr[size-2]);
    }
}
