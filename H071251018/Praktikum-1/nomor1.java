import java.util.Scanner;

public class nomor1 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan judul film: ");
        String judul = input.nextLine();

        String [] kata = judul.split(" ");
        String hasil = "";

        // for (int i = 0; i < kata.length; i++) {
        //     String hurufPertama = kata[i].substring(0, 1).toUpperCase();
        //     String sisaKata = kata[i].substring(1).toLowerCase();
        //     hasil += hurufPertama + sisaKata + " ";
        // }

        // gunakan for each untuk loopingya
        for (String k : kata) {
            String hurufPertama = k.substring(0, 1).toUpperCase();
            String sisaKata = k.substring(1).toLowerCase();
            hasil += hurufPertama + sisaKata + " ";
        }
        System.out.println("Ouput:" + hasil.trim());   
        input.close(); 
    }
}