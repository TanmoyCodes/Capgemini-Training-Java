public class palidrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int left = 0;
        int right = arr.length-1;

        boolean isPalindrome = true;
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
