public class CarEngineDriver {
    public static void main(String[] args){
        Car c = new Car();
        System.out.println(c.price);
        System.out.println(c.color);

        System.out.println(c.wheel);
        System.out.println("---------Calling Engine Member-----------");
        // System.out.println(c.e.cc);
        // System.out.println(c.e.cc);
        System.out.println("-----------Calling MusicPlayer member--------------");
        System.out.println(c.mp.bass);
        System.out.println(c.mp.bass);
    }
}
