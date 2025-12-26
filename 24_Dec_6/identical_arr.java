public class identical_arr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};


        boolean identical = true;
        if(arr1.length!=arr2.length){
            identical = false;
            System.out.println(identical);
            return;
        }
        System.out.println("Running");
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                identical = false;
                System.out.println(identical);
                return;
            }
        }
        System.out.println(identical);
        

    }
}
