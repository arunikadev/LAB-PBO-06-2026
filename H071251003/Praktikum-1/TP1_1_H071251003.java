import java.util.Scanner;

public class TP1_1_H071251003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan judul film: ");
        String judul = input.nextLine();
        String processed[]= judul.split(" ");
        for (int i = 0; i < processed.length; i++) {
            for (int j = 0; j < processed[i].length(); j++) {
                if(j==0){
                    String fixed = processed[i].substring(0,1).toUpperCase() + processed[i].substring(1).toLowerCase();
                    System.out.print(fixed + " ");
                }else{
                    break;
                }
            }
        }
    }
}
