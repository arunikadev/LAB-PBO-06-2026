import java.util.Scanner;

public class TP1_4_H071251003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long hasil = faktorial(n);
        System.out.println(n + "! = " + hasil);}

    public static long faktorial(int n) {
        if(n== 0||n== 1){
            return 1;
        }else {
            return n * faktorial(n - 1);
        }
    }
}