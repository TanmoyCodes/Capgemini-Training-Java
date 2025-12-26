public class pair_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int size = arr.length;


        int target = 10;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("["+arr[i]+","+arr[j]+"] ");
                }
            }
        }
    }
}
