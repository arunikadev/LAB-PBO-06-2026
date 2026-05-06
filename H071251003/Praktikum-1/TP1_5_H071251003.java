import java.util.Scanner;

public class TP1_5_H071251003 {
    public static void main(String[] args) {
        String result = null;
        Scanner input = new Scanner(System.in);
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
        int masukan = 0;

        try {
            System.out.print("Enter a number: ");
            masukan = input.nextInt();}
        catch (Exception e){
            System.out.println("Please enter a valid number (i/e 2, 6, etc.)");
            return;
        }
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == masukan) {
                result= ("["+i+"]["+j+"]");           
                break;
                }
            }
        }
        System.out.println(masukan+" found at "+result);
    }
}