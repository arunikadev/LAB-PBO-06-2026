// Class Alamat sebagai objek untuk atribut
class Alamat {
    String jalan;
    String kota;
    String provinsi; 
    
    public Alamat(){

    }
    
    // Constructor untuk Alamat
    public Alamat(String jalan, String kota, String provinsi) {
        this.jalan = jalan;
        this.kota = kota;
        this.provinsi = provinsi;
    }
    
    // Behavior : menampilkan alamat lengkap
    public void displayAlamat() {
        System.out.println("Jalan: " + jalan);
        System.out.println("Kota: " + kota);
        System.out.println("Provinsi: " + provinsi);
    }
}

// Class Mahasiswa yang memenuhi syarat
class Mahasiswa {
    // Atribut: minimal 3, salah satu objek dari class lain
    String nama;
    int nim;
    Alamat alamat; // objek dari class Alamat
    
    // Constructor default
    public Mahasiswa() {
        
    }
    
    // Constructor dengan parameter
    public Mahasiswa(String nama, int nim, Alamat alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }
    
    // Method behavior 1: berinteraksi dengan atribut objek
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat.jalan + ", " + alamat.kota);
    }
    
    // Method behavior 2: interaksi antar objek dari class yang sama
    public void bertemu(Mahasiswa other) {
        System.out.println("Mahasiswa " + this.nama + " bertemu dengan " + other.nama + " di " + this.alamat.kota);
    }
}

public class Tuprak_2 {
    public static void main(String[] args) {
        // Membuat objek Alamat dengan provinsi
        Alamat alamat1 = new Alamat("Jl. Sudirman", "Jakarta", "DKI Jakarta");
        Alamat alamat2 = new Alamat("Jl. Malioboro", "Yogyakarta", "DIY Yogyakarta");
        
        // Membuat objek Mahasiswa menggunakan constructor parameterized
        Mahasiswa mhs1 = new Mahasiswa("Alice", 12345, alamat1);
        Mahasiswa mhs2 = new Mahasiswa("Bob", 67890, alamat2);
        
        // Menggunakan method displayInfo (berinteraksi dengan atribut objek)
        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
        System.out.println();
        
        // Menggunakan behavior baru dari Alamat
        System.out.println("=== Detail Alamat Mahasiswa 1 ===");
        alamat1.displayAlamat();
        System.out.println();
        
        // Menggunakan method bertemu (interaksi antar objek)
        mhs1.bertemu(mhs2);
    }
}

