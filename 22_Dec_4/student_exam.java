public class student_exam {
    public static void main(String[] args) {

        double no_class_held = 100;
        double no_class_attended = 75;

        double attendence = (no_class_attended / no_class_held) * 100;

        System.out.println(attendence);

        if (attendence > 75) {
            System.out.println("Not eligible for exam");
        } else {
            System.out.println("Eligible");
        }
    }
}
