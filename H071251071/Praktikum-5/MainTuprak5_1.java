import java.util.Scanner;

// Main Class untuk Tuprak_5_1
public class MainTuprak5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instansiasi KaryawanTetap
        System.out.println("=== Karyawan Tetap ===");
        System.out.print("Masukkan nama: ");
        String namaTetap = scanner.nextLine();
        System.out.print("Masukkan ID Karyawan: ");
        String idTetap = scanner.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan tunjangan makan per hari: ");
        double tunjanganMakan = scanner.nextDouble();
        
        KaryawanTetap karyawanTetap = new KaryawanTetap(namaTetap, idTetap, gajiPokok, tunjanganMakan);
        
        // Absen 5 kali
        for (int i = 0; i < 5; i++) {
            karyawanTetap.absen();
        }
        
        System.out.println("Nama: " + karyawanTetap.getNama());
        System.out.println("ID: " + karyawanTetap.getIdKaryawan());
        System.out.println("Jumlah Kehadiran: " + karyawanTetap.getJumlahKehadiran());
        System.out.println("Total Gaji: Rp" + karyawanTetap.hitungGaji());
        System.out.println("Total Gaji + Bonus Kinerja: Rp" + karyawanTetap.hitungGaji(500000));
        System.out.println();

        // Instansiasi KaryawanKontrak
        System.out.println("=== Karyawan Kontrak ===");
        scanner.nextLine(); // consume newline
        System.out.print("Masukkan nama: ");
        String namaKontrak = scanner.nextLine();
        System.out.print("Masukkan ID Karyawan: ");
        String idKontrak = scanner.nextLine();
        System.out.print("Masukkan upah per hari: ");
        double upahPerHari = scanner.nextDouble();
        
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(namaKontrak, idKontrak, upahPerHari);
        
        // Absen 22 kali (lebih dari 20 untuk触发 bonus)
        for (int i = 0; i < 22; i++) {
            karyawanKontrak.absen();
        }
        
        System.out.println("Nama: " + karyawanKontrak.getNama());
        System.out.println("ID: " + karyawanKontrak.getIdKaryawan());
        System.out.println("Jumlah Kehadiran: " + karyawanKontrak.getJumlahKehadiran());
        System.out.println("Total Gaji: Rp" + karyawanKontrak.hitungGaji());
        
        scanner.close();
    }
}