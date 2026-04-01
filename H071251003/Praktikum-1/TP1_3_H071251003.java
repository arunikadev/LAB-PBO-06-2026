import java.util.Scanner;
import java.util.regex.*;

public class TP1_3_H071251003 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input Password: ");
        String password = input.nextLine();
        //get regex or somthin
        String regex= "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(password);
        while(true) {
            matcher = pattern.matcher(password);
            if(matcher.matches()){
                System.out.println("Password valid");
                break;
            }else {
                System.out.println("Password tidak valid");
                System.out.println("Input Password: ");
                password = input.nextLine();
            }
        }
    }
}
