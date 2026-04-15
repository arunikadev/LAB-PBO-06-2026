import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        boolean adaHurufBesar = false;
        boolean adaHurufKecil = false;
        boolean adaAngka = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) adaHurufBesar = true;
            if (Character.isLowerCase(c)) adaHurufKecil = true;
            if (Character.isDigit(c))     adaAngka = true;
        }

        if (password.length() >= 8 && adaHurufBesar && adaHurufKecil && adaAngka) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
        input.close();
    }
}