package nomor01;

public class main {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Andi", "T01", 5000000, 50000);
        kt.absen(); 
        kt.absen(); 
        kt.absen();
        System.out.println("Gaji Tetap + Bonus: Rp." + kt.hitungGaji(1000000));

        KaryawanKontrak kk = new KaryawanKontrak("Budi", "K01", 150000); 
        for(int i=0; i<22; i++) 
            kk.absen();
        System.out.println("Gaji Kontrak (21 hari): Rp." + kk.hitungGaji());
    }
}