import java.util.Scanner;

public class soal_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        
        if (password.length() < 8) {
            System.out.println("Password harus minimal 8 karakter");
            return;
        }
        
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }
        
        if (hasUpper && hasLower && hasDigit) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid: harus mengandung huruf besar, kecil, dan angka");
        }
        scanner.close();
    }
}
