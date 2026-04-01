import java.util.Scanner;

public class tuprak4 {
    public static int faktorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        if (n < 0){
            System.out.println("Harap masukkan angka positif!");
        }

        int hasil = faktorial(n);

        System.out.println("Hasil faktorial dari " + n + " adalah: " + hasil);
    }
}
