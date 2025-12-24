public class isUpper {
    public static void main(String[] args) {
        char ch = 'T';
        boolean isUpper = Character.isUpperCase(ch);
        System.out.println(isUpper);


        if(isUpper==false){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper Case");
        }
    }

}
