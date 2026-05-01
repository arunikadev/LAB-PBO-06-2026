// Class KaryawanTetap (Subclass dari Karyawan)
class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double tunjanganMakan;

    // Constructor
    public KaryawanTetap(String nama, String idKaryawan, double gajiPokok, double tunjanganMakan) {
        super(nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
    }

    // Logic hitungGaji(): Total Gaji = gajiPokok + (tunjanganMakan * jumlahKehadiran)
    @Override
    public double hitungGaji() {
        return gajiPokok + (tunjanganMakan * getJumlahKehadiran());
    }

    // Overloading Method: Buat method hitungGaji(double bonusKinerja)
    // yang mengembalikan: (Total Gaji + bonusKinerja)
    public double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }

    // Getter
    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTunjanganMakan() {
        return tunjanganMakan;
    }
}