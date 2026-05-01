import java.util.Scanner;

public class nomor4 {

    static int faktorial(int n) {
        if (n <= 1) return 1;
        return n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        System.out.println("Output: " + faktorial(n));
        sc.close();
    }
}