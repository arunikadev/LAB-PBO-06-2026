import java.util.Scanner;

public class TP1_3_H071251001 {

    public static boolean validasiPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean adaHurufBesar = false;
        boolean adaHurufKecil = false;
        boolean adaAngka = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                adaHurufBesar = true;
            } else if (Character.isLowerCase(c)) {
                adaHurufKecil = true;
            } else if (Character.isDigit(c)) {
                adaAngka = true;
            }
        }

        return adaHurufBesar && adaHurufKecil && adaAngka;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (validasiPassword(password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}