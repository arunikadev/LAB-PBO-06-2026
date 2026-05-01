import java.util.Scanner;

public class Soal_1 {
    
    public static String kapitalString(String str) {
        String[] words = str.split(" ");
        String hasil = "";
        
        for (String word : words) {
            if (word.length() > 0) {
                hasil += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            }
        }
        
        return hasil.trim();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Judul Film: ");
        String input = sc.nextLine();
        
        System.out.println("Hasil: " + kapitalString(input));
        
        sc.close();
    }
}

    
