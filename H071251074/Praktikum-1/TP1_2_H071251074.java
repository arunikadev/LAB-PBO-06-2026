import java.util.Scanner;

public class tuprak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = input.nextLine();

        if (tanggal.length() != 8){
            System.out.println("Format tidak valid");
        }else{

        String hariStr = tanggal.substring(0, 2);
        String bulanStr = tanggal.substring(3, 5);
        String tahunStr = tanggal.substring(6, 8);

        int hari = Integer.parseInt(hariStr);
        int bulan = Integer.parseInt(bulanStr);
        int tahun = Integer.parseInt(tahunStr);

        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        if (tahun == 26 && bulan < 4 || tahun <= 25) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        System.out.println(hari + " " + namaBulan[bulan - 1] + " " + tahun);
        }
    }
}