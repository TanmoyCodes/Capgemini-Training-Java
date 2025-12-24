public class polygon {
    public static void areaOfRectangle(int l, int b){
        int area = 2*(l+b);
        System.out.println(area);
    }

     public static void areaOfSq(int l, int b){
        int area = l*b;
        System.out.println(area);
    }
     public static void areaOfRad(int r){
        double area = 2*3.14*r*r;
        System.out.println(area);
    }
     public static void areaOfTri(int b, int h){
        double area = (0.5)*b*h;
        System.out.println(area);
    }
     
    public static void main(String[] args) {
        areaOfRectangle(4, 8);
        areaOfSq(5, 5);
        areaOfRad(4);
        areaOfTri(4, 8);
    }
}
