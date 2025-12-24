public class marks {
    public static void main(String[] args) {
        int marks = 80;
        if (marks >= 60 && marks <= 100)
            System.out.println("First Division");

        else if (marks >= 45) {
            System.out.println("Second Division");
        } else if (marks >= 33) {
            System.out.println("Third Division ");
        } else if (marks < 33 && marks >= 0) {
            System.out.println("Fail");
        }
    }
}