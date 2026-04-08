import java.util.Scanner;


public class T1_5_H071251016 {
     public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 6, 9}
            };

            System.out.print("Masukkan angka yang dicari: ");
            int cari = input.nextInt();

            boolean ditemukan = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == cari) {
                        System.out.println("Found " + cari + " at [" + i + "][" + j + "]");
                        ditemukan = true;
                        
                    }
                    
                
                }
                
            }

            if (!ditemukan) {
                System.out.println("Angka tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input!");
        }
    }
}
