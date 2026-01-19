import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class sets {
    public static void main(String[] args) {
        HashSet h = new HashSet();

        h.add("Raj");
        h.add("Mandira");
        h.add("Prachi");
        h.add("Khusi");
        h.add("Tanmoy");
        h.add("Tanmoy");
        
        


        System.out.println(h);
        LinkedHashSet h1 = new LinkedHashSet();
        h1.add("Raj");
        h1.add("Mandira");
        h1.add("Prachi");
        h1.add("Khusi");
        h1.add("Tanmoy");
        
        h1.add("Tanmoy");
        h1.add(null);
        h1.add(5);
        h1.add(100);
        System.out.println(h1);

        TreeSet t = new TreeSet();
        t.add(5);
        t.add(5);
        t.add(9);
        t.add(5);
        t.add(5);
        t.add(5);
        t.add(5);
        t.add(5);
        t.add(5);
        
    }
}
