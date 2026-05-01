public class Main {
    public static void main(String[] args) {

        JadwalMakan jm1 = new JadwalMakan();
        jm1.setWaktu("Pagi")
        jm1.jenisMakanan = "Dry Food";

        Kesehatan ks1 = new Kesehatan();
        ks1.status = "Sehat";
        ks1.terakhirCek = "Kemarin";

        PetCare pet1 = new PetCare("Kucing", 2, 70, jm1, ks1);

        JadwalMakan jm2 = new JadwalMakan();
        jm2.waktu = "Sore";
        jm2.jenisMakanan = "Wet Food";

        Kesehatan ks2 = new Kesehatan();
        ks2.status = "Kurang sehat";
        ks2.terakhirCek = "2 hari lalu";

        PetCare pet2 = new PetCare("Anjing", 3, 60, jm2, ks2);

        pet1.beriMakan();
        pet1.bandingkanKesehatan(pet2);
    }
}