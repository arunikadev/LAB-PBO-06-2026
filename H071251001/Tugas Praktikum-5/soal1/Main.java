public class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TETAP ===");
        KaryawanTetap tetap = new KaryawanTetap("Andi", "KT001", 5000000, 50000);

        for (int i = 0; i < 22; i++) {
            tetap.absen();
        }

        System.out.println("Nama              : " + tetap.getNama());
        System.out.println("ID Karyawan       : " + tetap.getidKaryawan());
        System.out.println("Jumlah Kehadiran  : " + tetap.getJumlahKehadiran());
        System.out.println("Gaji Tanpa Bonus  : Rp" + tetap.hitungGaji());
        System.out.println("Gaji Dengan Bonus : Rp" + tetap.hitungGaji(1000000));

        System.out.println("\n=== DATA KARYAWAN KONTRAK ===");
        KaryawanKontrak kontrak = new KaryawanKontrak("Budi", "KK001", 200000);

        for (int i = 0; i < 20; i++) {
            kontrak.absen();
        }

        System.out.println("Nama              : " + kontrak.getNama());
        System.out.println("ID Karyawan       : " + kontrak.getidKaryawan());
        System.out.println("Jumlah Kehadiran  : " + kontrak.getJumlahKehadiran());
        System.out.println("Total Gaji        : Rp" + kontrak.hitungGaji());
    }
}