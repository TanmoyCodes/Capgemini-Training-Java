public class job {
    public static void main(String[] args) {
        int age = 24;
        char gender = 'M';
        boolean maritial_status = false;

        if (gender == 'F') {
            System.out.println("Only urban area");
        } else if (gender == 'M' && age > 40 && age < 20) {
            System.out.println("Work anywhere");
        } else if (gender == 'M' && age > 40 && age < 60) {
            System.out.println("Urban Area");
        }

        else {

            System.out.println("NOT DEFINED: Work from anyWhere");
        }

    }
}
