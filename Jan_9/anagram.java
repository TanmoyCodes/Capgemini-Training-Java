import java.util.Arrays;
public class anagram {
    
    public static void main(String[] args) {
        String a = "Mother-in-law";
        String b = "Hitler women";

        char[] n = a.toCharArray();
        char[] m = b.toCharArray();

        // if(n.length!= m.length){
        //     return;
        // }

        
        
        Arrays.sort(n);
        Arrays.sort(m);

        boolean res = Arrays.equals(n, m);
        System.out.println(res);
    }
}
