import java.util.Scanner;

public class T1_1_H071251016 {

    public static String kapitalAwal(String kalimat) {
        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (String k : kata) {
            if (k.length() > 0) {
                hasil += k.substring(0, 1).toUpperCase() +
                         k.substring(1).toLowerCase() + " ";
            }
        }

        return hasil.trim();
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Masukkan Judul Film: ");
            String teks = input.nextLine();

            System.out.println("Output: " + kapitalAwal(teks));
        }
    }
}