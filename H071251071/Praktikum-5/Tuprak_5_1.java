// Main Class
public class Tuprak_5_1 {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PENGGAJIAN & BONUS KINERJA ===\n");

        // Buat objek KaryawanTetap, lakukan absen() beberapa kali, 
        // lalu panggil hitungGaji() dengan bonus
        System.out.println("--- Karyawan Tetap ---");
        KaryawanTetap karyawanTetap = new KaryawanTetap(
            "Budi Santoso", 
            "KT001", 
            5000000,  // gajiPokok
            50000     // tunjanganMakan per hari
        );

        // Lakukan absen() beberapa kali
        karyawanTetap.absen();
        karyawanTetap.absen();
        karyawanTetap.absen();
        karyawanTetap.absen();
        karyawanTetap.absen();

        System.out.println("Nama: " + karyawanTetap.getNama());
        System.out.println("ID Karyawan: " + karyawanTetap.getIdKaryawan());
        System.out.println("Jumlah Kehadiran: " + karyawanTetap.getJumlahKehadiran() + " hari");
        System.out.println("Gaji Pokok: Rp " + String.format("%,.0f", karyawanTetap.getGajiPokok()));
        System.out.println("Tunjangan Makan per hari: Rp " + String.format("%,.0f", karyawanTetap.getTunjanganMakan()));
        
        double bonusKinerja = 750000; // Bonus kinerja Rp 750.000
        System.out.println("\n--- Hitung Gaji dengan Bonus Kinerja ---");
        System.out.println("Bonus Kinerja: Rp " + String.format("%,.0f", bonusKinerja));
        System.out.println("Total Gaji (tanpa bonus): Rp " + String.format("%,.0f", karyawanTetap.hitungGaji()));
        System.out.println("Total Gaji (dengan bonus): Rp " + String.format("%,.0f", karyawanTetap.hitungGaji(bonusKinerja)));

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Buat objek KaryawanKontrak, lakukan absen() lebih dari 20 kali, 
        // dan tampilkan total gajinya
        System.out.println("--- Karyawan Kontrak ---");
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(
            "Siti Aminah", 
            "KK001", 
            150000  // upahPerHari
        );

        // Lakukan absen() lebih dari 20 kali
        for (int i = 0; i < 22; i++) {
            karyawanKontrak.absen();
        }

        System.out.println("Nama: " + karyawanKontrak.getNama());
        System.out.println("ID Karyawan: " + karyawanKontrak.getIdKaryawan());
        System.out.println("Jumlah Kehadiran: " + karyawanKontrak.getJumlahKehadiran() + " hari");
        System.out.println("Upah per Hari: Rp " + String.format("%,.0f", karyawanKontrak.getUpahPerHari()));
        
        double totalGajiKontrak = karyawanKontrak.hitungGaji();
        System.out.println("\n--- Total Gaji ---");
        System.out.println("Total Gaji (dasar): Rp " + String.format("%,.0f", karyawanKontrak.getUpahPerHari() * karyawanKontrak.getJumlahKehadiran()));
        
        // Cek apakah dapat bonus
        if (karyawanKontrak.getJumlahKehadiran() > 20) {
            System.out.println("Bonus (kehadiran > 20 hari): Rp 500.000");
        }
        
        System.out.println("Total Gaji Akhir: Rp " + String.format("%,.0f", totalGajiKontrak));

        System.out.println("\n=== Selesai ===");
    }
}
