import java.util.Scanner;

public class TP1_1_H071251001 {
    
    // Method untuk mengubah huruf pertama tiap kata jadi kapital
    public static String kapitalAwal(String kalimat) {
        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].length() > 0) {
                hasil += Character.toUpperCase(kata[i].charAt(0)) 
                        + kata[i].substring(1) + " ";
            }
        }
        
        return hasil.trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Judul Film: ");
        String kalimat = input.nextLine();

        String output = kapitalAwal(kalimat);

        System.out.println("Output: " + output);
    }
}