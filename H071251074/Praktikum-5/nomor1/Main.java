package nomor1;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== KARYAWAN TETAP ===");
 
        KaryawanTetap tetap = new KaryawanTetap("Patri", "TDR-3000", 5000000, 50000);

        for (int i = 0; i < 15; i++) tetap.absen();
 
        double gajiDasar   = tetap.hitungGaji();
        double gajiDenganBonus = tetap.hitungGaji(1_500_000);

        System.out.println("\n--- Rekap Gaji ---");
        System.out.printf("Gaji tanpa bonus: Rp%,.0f%n", gajiDasar);
        System.out.printf("Gaji + bonus kinerja: Rp%,.0f%n", gajiDenganBonus);
 
        System.out.println("\n=== KARYAWAN KONTRAK ===");
 
        KaryawanKontrak kontrak = new KaryawanKontrak("Cius", "KK-020", 200000);
 
        for (int i = 0; i < 27; i++) kontrak.absen();
 
        double gajiKontrak = kontrak.hitungGaji();
 
        System.out.println("\n--- Rekap Gaji ---");
        System.out.printf("Total Gaji: Rp%,.0f%n", gajiKontrak);
    }
}