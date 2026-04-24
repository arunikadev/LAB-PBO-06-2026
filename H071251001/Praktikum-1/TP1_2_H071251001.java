import java.util.Scanner;

public class TP1_2_H071251001 {

    public static String konversiTanggal(String input) {
        try {
            String[] bagian = input.split("-");

            // Validasi format
            if (bagian.length != 3) {
                return "Format salah! Gunakan dd-mm-yy";
            }

            int hari = Integer.parseInt(bagian[0]);
            int bulan = Integer.parseInt(bagian[1]);
            int tahun = Integer.parseInt(bagian[2]);

            // Validasi hari & bulan
            if (hari < 1 || hari > 31) {
                return "Error: Hari tidak valid!";
            }

            if (bulan < 1 || bulan > 12) {
                return "Error: Bulan tidak valid!";
            }

            // Konversi tahun
            if (tahun >= 0 && tahun <= 49) {
                tahun += 2000;
            } else {
                tahun += 1900;
            }

            // Validasi batas tahun
            if (tahun > 2026) {
                return "Error: Tahun melebihi batas (2026)!";
            }

            String[] namaBulan = {
                "Januari", "Februari", "Maret", "April",
                "Mei", "Juni", "Juli", "Agustus",
                "September", "Oktober", "November", "Desember"
            };

            return hari + " " + namaBulan[bulan - 1] + " " + tahun;

        } catch (Exception e) {
            return "Error: Input tidak valid!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = input.nextLine();

        String hasil = konversiTanggal(tanggal);

        System.out.println("Output: " + hasil);
    }
}