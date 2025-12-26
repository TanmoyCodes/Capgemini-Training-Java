public class pattern {
    public static void main(String[] args) {
        int size = 5;
        // for(int i = size; i>=0; i--){

        // int temp = 5;
        // for(int j = size-i; j<= size; j++){
        // System.out.print(" ");
        // }
        // for(int k = size-i; k>0; k--){
        // System.out.print(temp);
        // temp--;
        // }
        // System.out.println();
        // }

        //

        for (int i = 0; i <= size; i++) {

            
            for (int j = i; j<=size; j++) {

                System.out.print(" ");

            }
            for(int k = size-i; k<size; k++){
                System.out.print("*");
            }
            for(int k = size-i-1; k<size; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
