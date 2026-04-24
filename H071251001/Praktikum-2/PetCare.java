class PetCare {
    String namaPet;
    int umur;
    int kesehatan;
    JadwalMakan jadwalMakan;
    Kesehatan dataKesehatan;

    // Constructor default
    PetCare() {
        namaPet = "Tidak diketahui";
        umur = 0;
        kesehatan = 50;
    }

    // Constructor parameter
    PetCare(String namaPet, int umur, int kesehatan, JadwalMakan jm, Kesehatan ks) {
        this.namaPet = namaPet;
        this.umur = umur;
        this.kesehatan = kesehatan;
        this.jadwalMakan = jm;
        this.dataKesehatan = ks;
    }

    // Method 1
    void beriMakan() {
        System.out.println(namaPet + " sedang makan " + jadwalMakan.jenisMakanan);
        kesehatan += 10;
    }

    // Method 2 
    void bandingkanKesehatan(PetCare lain) {
        if (this.kesehatan > lain.kesehatan) {
            System.out.println(namaPet + " lebih sehat dari " + lain.namaPet);
        } else if (this.kesehatan < lain.kesehatan) {
            System.out.println(lain.namaPet + " lebih sehat dari " + namaPet);
        } else {
            System.out.println("Kesehatan mereka sama");
        }
    }
}