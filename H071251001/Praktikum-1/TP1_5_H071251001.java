import java.util.Scanner;

public class TP1_5_H071251001 {

    public static void main(String[] args) {

        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int cari = input.nextInt();

        try {
            boolean ketemu = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {

                    if (nums[i][j] == cari) {
                        System.out.println("Found " + cari + " at [" + i + "][" + j + "]");
                        ketemu = true;
                        break; // keluar dari loop dalam
                    }
                }

                if (ketemu) {
                    break; // keluar dari loop luar
                }
            }

            if (!ketemu) {
                System.out.println("Angka tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Terjadi error pada input!");
        }
    }
}