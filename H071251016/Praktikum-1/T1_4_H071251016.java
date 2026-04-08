import java.util.Scanner;   


public class T1_4_H071251016 {
    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            int n = input.nextInt();

            int hasil = faktorial(n);

            System.out.println("Hasil: " + hasil);
        }
    }
}
