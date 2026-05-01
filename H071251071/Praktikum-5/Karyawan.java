// Abstract Class Karyawan (Superclass)
abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    private int jumlahKehadiran;

    // Constructor untuk inisialisasi nama dan idKaryawan
    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.jumlahKehadiran = 0;
    }

    // Method konkrit absen(): Menambah jumlahKehadiran sebanyak 1 setiap kali dipanggil
    public void absen() {
        this.jumlahKehadiran++;
    }

    // Method abstract hitungGaji()
    public abstract double hitungGaji();

    // Getter untuk jumlahKehadiran (diperlukan untuk subclass)
    public int getJumlahKehadiran() {
        return jumlahKehadiran;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk idKaryawan
    public String getIdKaryawan() {
        return idKaryawan;
    }
}