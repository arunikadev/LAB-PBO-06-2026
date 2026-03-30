import java.util.Scanner;

public class soal_5 {
    public static void main(String[] args) {
        // Deklarasi array 2D
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Input satu buah bilangan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang dicari: ");
        int target = 0;
        try {
            target = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harus berupa bilangan bulat.");
            return;
        }

        // Perulangan untuk mencari angka
        boolean found = false;
        outerLoop:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Angka " + target + " ditemukan di posisi [" + i + "][" + j + "]");
                    found = true;
                    break outerLoop; // Hentikan semua perulangan
                }
            }
        }

        if (!found) {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }

        scanner.close();
    }
}
