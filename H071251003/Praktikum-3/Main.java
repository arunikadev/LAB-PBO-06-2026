
public class Main {
    public static void main(String[] args) {
        System.out.println("1.) Tampilkan informasi identitas akun menggunakan Getter. ");
        DompetDigital dompet = new DompetDigital("nono", "654321");
        System.out.println("\n2.) Lakukan uji coba metode Setter (Ubah PIN) dengan memasukkan PIN lama yang salah (Pastikan sistem menolak).");
        dompet.ubahPin("12345", "654321");
        System.out.println("\n3.) Lakukan uji coba metode Setter (Ubah PIN) dengan memenuhi syarat yang benar (Pastikan PIN berhasil diubah). ");
        dompet.ubahPin("654321", "123456");
        System.out.println("\n4.) Lakukan uji coba metode Setor Tunai dengan memasukkan nominal yang valid.");
        dompet.getsetorTunai(50000);
        System.out.println("\n5.) Lakukan setor tunai dengan nominal ilegal/negatif (Pastikan ditolak). ");
        dompet.getsetorTunai(-10000);
        System.out.println("\n6.) Lakukan tarik tunai menggunakan PIN yang lama/salah (Pastikan ditolak).");
        dompet.tarikTunai("654321", 20000);
        System.out.println("\n7.) Lakukan tarik tunai menggunakan PIN yang baru/benar (Pastikan berhasil).");
        dompet.tarikTunai("123456", 20000);
        System.out.println("\n8.) Tampilkan sisa saldo akhir menggunakan Getter. ");
        System.out.println("Saldo Anda saat ini: Rp." + dompet.getSaldo());
        
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("=== SELAMAT DATANG DI GEMINI WALLET ===");
        // System.out.print("Daftarkan nama Anda: ");
        // String nama = sc.nextLine();
        // System.out.print("Buat PIN Keamanan (6 angka): ");
        // String pinAwal = sc.nextLine();
        
        // DompetDigital dompet = new DompetDigital(nama, pinAwal);
        
        // boolean berjalan = true;
        // while (berjalan) {
        //     System.out.println("\n------------------------------");
        //     System.out.println("PENGGUNA: " + dompet.getNamaNasabah());
        //     System.out.println("1. Cek Saldo");
        //     System.out.println("2. Setor Tunai");
        //     System.out.println("3. Tarik Tunai");
        //     System.out.println("4. Ganti PIN");
        //     System.out.println("5. Keluar");
        //     System.out.print("Pilih menu (1-5): ");
            
        //     int pilihan = sc.nextInt();
        //     sc.nextLine();
        //     switch (pilihan) {
        //         case 1:
        //             System.out.println("Saldo Anda saat ini: " + dompet.getSaldo() + " " + dompet.mataUang);
        //             break;
                    
        //         case 2:
        //             System.out.print("Masukkan jumlah setor: ");
        //             double jmlSetor = sc.nextDouble();
        //             dompet.setorTunai(jmlSetor);
        //             break;
                    
        //         case 3:
        //             System.out.print("Masukkan nominal tarik: ");
        //             double jmlTarik = sc.nextDouble();
        //             sc.nextLine(); 
        //             System.out.print("Konfirmasi PIN Anda: ");
        //             String pinTarik = sc.nextLine();
                    
        //             if (dompet.tarikTunai(pinTarik, jmlTarik)) {
        //                 System.out.println("Tarik tunai berhasil! Silakan ambil uang Anda.");
        //             } else {
        //                 System.out.println("Transaksi Gagal! Periksa PIN atau saldo Anda.");
        //             }
        //             break;
                    
        //         case 4:
        //             System.out.print("Masukkan PIN Lama: ");
        //             String pLama = sc.nextLine();
        //             System.out.print("Masukkan PIN Baru (6 digit): ");
        //             String pBaru = sc.nextLine();
                    
        //             if (dompet.ubahPin(pLama, pBaru)) {
        //                 System.out.println("Perubahan PIN sukses!");
        //             } else {
        //                 System.out.println("Gagal mengubah PIN! Pastikan PIN lama benar & PIN baru 6 digit.");
        //             }
        //             break;
                    
        //         case 5:
        //             System.out.println("Terima kasih telah menggunakan Gemini Wallet.");
        //             berjalan = false;
        //             break;
                    
        //         default:
        //             System.out.println("Menu tidak tersedia.");
        //     }
        // }
        // sc.close();
    }
}