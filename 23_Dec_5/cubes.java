public class cubes {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;


        for(int i=0; i<num; i+=2){
           
            sum += i * i * i;
            
        }
        System.out.println(sum);
    }
}
