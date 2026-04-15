public class Main {
    public static void main(String[] args) {

        Proyek p1 = new Proyek("Aplikasi UMKM", 10);
        Klien  k1 = new Klien("Budi", 3500000);

        Proyek p2 = new Proyek("Website Perusahaan", 7);
        Klien  k2 = new Klien("Andi", 2000000);

        Freelancer farhan  = new Freelancer("Farhan",  400000, p1, k1);
        Freelancer alief   = new Freelancer("Alief",   300000, p1, k1);
        Freelancer alfa    = new Freelancer("Alfa",    200000, p2, k2);
        Freelancer heindro = new Freelancer("Heindro", 300000, p2, k2);

        System.out.println("===== CEK PENGHASILAN =====");
        farhan.hitungPenghasilan();
        System.out.println();
        alief.hitungPenghasilan();
        System.out.println();
        alfa.hitungPenghasilan();
        System.out.println();
        heindro.hitungPenghasilan();
        System.out.println();

        System.out.println("===== KOLABORASI =====");
        farhan.kerjasama(alief);
        System.out.println();
        alfa.kerjasama(heindro);
    }
}