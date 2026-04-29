import java.util.Scanner;

public class tuprak5 {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 6, 9}
        };
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input angka yang dicari: ");
            int target = input.nextInt();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {

                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " berada di [" + i + "][" + j + "]");
                    }
                }   
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}