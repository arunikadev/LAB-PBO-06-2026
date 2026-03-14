import java.util.Scanner;

public class nomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = input.nextLine();

        String[] parts = tanggal.split("-");
        int hari = Integer.parseInt(parts[0]);
        int bulan = Integer.parseInt(parts[1]);
        int tahun = Integer.parseInt(parts[2]);

        String[] namaBulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember" };

        if (bulan < 1 || bulan > 12) {
            System.out.println("Bulan tidak valid");

            if (tahun >= 0 && tahun <= 26) {
                tahun += 2000;
            } else {
                tahun += 1900;
            }

            System.out.println("Tanggal: " + hari + "-" + namaBulan[bulan - 1] + "-" + tahun);
            input.close();
        }
    }
}