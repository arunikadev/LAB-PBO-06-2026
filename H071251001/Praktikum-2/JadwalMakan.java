class JadwalMakan {
    String waktu;
    String jenisMakanan;

    void tampilJadwal() {
        System.out.println("Waktu: " + waktu + ", Makanan: " + jenisMakanan);
    }

    void setWaktu(String waktu){
        this.waktu = waktu;
    }
}