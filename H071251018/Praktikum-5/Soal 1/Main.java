public class Main {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Budi", "KT-001", 5000000, 25000);
        for (int i = 0; i < 18; i++) kt.absen();

        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama       : " + kt.getNama());
        System.out.println("Kehadiran  : " + kt.jumlahKehadiran + " hari");
        System.out.println("Gaji Pokok : Rp" + kt.hitungGaji());
        System.out.println("Gaji + Bonus Kinerja Rp1.000.000 : Rp" + kt.hitungGaji(1000000));

        System.out.println();

        KaryawanKontrak kk = new KaryawanKontrak("Sari", "KK-002", 150000);
        for (int i = 0; i < 22; i++) kk.absen();

        System.out.println("=== Karyawan Kontrak ===");
        System.out.println("Nama       : " + kk.getNama());
        System.out.println("Kehadiran  : " + kk.jumlahKehadiran + " hari");
        System.out.println("Total Gaji : Rp" + kk.hitungGaji());
    }
}
