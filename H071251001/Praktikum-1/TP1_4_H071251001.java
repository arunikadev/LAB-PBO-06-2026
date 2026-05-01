import java.util.Scanner;

public class TP1_4_H071251001 {

    // Method rekursi untuk faktorial
    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Error: Faktorial tidak bisa untuk bilangan negatif!");
        } else {
            int hasil = faktorial(n);
            System.out.println("Output: " + hasil);
        }
    }
}