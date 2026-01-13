public class countCase {
    public static void main(String[] args) {
        int upperCase = 0;
        int lowercase = 0;
        int specialCharr = 0;
        int space = 0;
        int digits = 0;

        String str = "Hello World 1234";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch<='z'){
                lowercase++;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                upperCase++;
            }
            else if(ch >= '0' && ch <= '9'){
                digits++;
            }
            else if(ch == ' '){
                space++;
            }
            else {
                specialCharr++;
            }

        }
            System.out.println(upperCase + " " + lowercase + " " + specialCharr + " " + space + " " + digits);
}
}