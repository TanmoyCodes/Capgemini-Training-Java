public class calculator {
    public static void sum(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }


    public static void pro(int num1, int num2){
        int sum = num1*num2;
         System.out.println(sum);
    }
    public static void rem(int num1, int num2){
        int sum = num1%num2;
         System.out.println(sum);
    }
    public static void discount(int num1, int num2){
        int sum = 0;
        int discount = (num1+num2)/10;
        sum = (num1+num2)-discount;
         System.out.println(sum);
    }
    public static void main(String[] args) {
        int num1 = 80;
        
        int num2 = 20;

        sum(num1, num2);
        pro(num1, num2);
        rem(num1, num2);
        discount(num1, num2);

    }
}
