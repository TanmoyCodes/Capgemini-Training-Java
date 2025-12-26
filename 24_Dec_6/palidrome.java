public class palidrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int left = 0;
        int right = arr.length-1;

        boolean isPalindrome = true;
        
        System.out.println("Size of the arr" + arr.length);
        if(arr.length%2==0){
            isPalindrome=false;
            return;
        }
        System.out.println("Runing while loop: ");
        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
       if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}