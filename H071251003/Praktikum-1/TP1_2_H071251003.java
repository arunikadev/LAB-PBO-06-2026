import java.util.Scanner;

public class TP1_2_H071251003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String masukan;
        String[] tanggal;
        String bulan = null, tahun;

        while (true) {
            System.out.println("Masukkan tanggal (dd-mm-yy): ");
            masukan = input.nextLine();
            tanggal = masukan.split("-");
            if (tanggal.length != 3||tanggal[0].length() != 2||tanggal[1].length() != 2||tanggal[2].length() != 2) {
                System.out.println("Format salah! Gunakan dd-mm-yy (dua digit semua).");
                continue;
            }
            switch (tanggal[1]) {
                case "01": bulan = "Januari"; break;
                case "02": bulan = "Februari"; break;
                case "03": bulan = "Maret"; break;
                case "04": bulan = "April"; break;
                case "05": bulan = "Mei"; break;
                case "06": bulan = "Juni"; break;
                case "07": bulan = "Juli"; break;
                case "08": bulan = "Agustus"; break;
                case "09": bulan = "September"; break;
                case "10": bulan = "Oktober"; break;
                case "11": bulan = "November"; break;
                case "12": bulan = "Desember"; break;
                default:
                    System.out.println("Bulan harus 01-12.");
                    continue;
            }
            int day;
            try {
                day = Integer.parseInt(tanggal[0]);
            } catch (NumberFormatException e) {
                System.out.println("Tanggal harus berupa angka dua digit (dd).");
                continue;
            }

            if (tanggal[1].equals("01")||tanggal[1].equals("03")||
                tanggal[1].equals("05")||tanggal[1].equals("07")||
                tanggal[1].equals("08")||tanggal[1].equals("10")||
                tanggal[1].equals("12")) {
                if (day< 1 || day>32) {
                    System.out.println("Tanggal harus antara 01-31 untuk bulan ini.");
                    continue;
                }
            } else if (tanggal[1].equals("04")||tanggal[1].equals("06")||
                       tanggal[1].equals("09")||tanggal[1].equals("11")) {
                if (day<1 || day>31) {
                    System.out.println("Tanggal harus antara 01-30 untuk bulan ini.");
                    continue;
                }
            } else if (tanggal[1].equals("02")) {
                if (day<1 || day>30) {
                    System.out.println("Tanggal harus antara 01-29 untuk bulan ini.");
                    continue;
                }}

            int tahunRaw;
            try {
                tahunRaw = Integer.parseInt(tanggal[2]);
            } catch (NumberFormatException e) {
                System.out.println("Tahun harus berupa angka dua digit (yy).");
                continue;
            }
            if (tahunRaw>=0 && tahunRaw<=26) {
                tahun= "20" + tanggal[2];
            } else {
                tahun= "19" + tanggal[2];
            }
            System.out.println(tanggal[0] + " " + bulan + " " + tahun);
            break;
        }
    }
}