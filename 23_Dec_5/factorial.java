public class factorial {
    public static void main(String[] args) {
        int n = 5;

        int i = 1;

        int sum = 0;
        System.out.println("0");
        while(i<5){
            sum+=sum;
            sum+=i;
            System.out.println(sum);
            i++;
        }
    }
}
