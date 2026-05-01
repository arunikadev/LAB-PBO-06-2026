// Class KaryawanKontrak (Subclass dari Karyawan)
class KaryawanKontrak extends Karyawan {
    private double upahPerHari;

    // Constructor
    public KaryawanKontrak(String nama, String idKaryawan, double upahPerHari) {
        super(nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    // Logic hitungGaji(): Total Gaji = upahPerHari * jumlahKehadiran
    @Override
    public double hitungGaji() {
        double totalGaji = upahPerHari * getJumlahKehadiran();
        
        // Validasi: Jika jumlahKehadiran lebih dari 20 hari, berikan bonus tambahan flat Rp500.000
        if (getJumlahKehadiran() > 20) {
            totalGaji += 500000;
        }
        
        return totalGaji;
    }

    // Getter
    public double getUpahPerHari() {
        return upahPerHari;
    }
}