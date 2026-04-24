import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("  ===== BANGUN RUANG =====");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println();
            System.out.println("  ===== BANGUN DATAR =====");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("----------------------------------------");
            System.out.print("Pilihan: ");
            int pilih = sc.nextInt();
            System.out.println("----------------------------------------");

            if (pilih == 1) {
                System.out.print("Masukkan sisi kubus: ");
                Kubus k = new Kubus(sc.nextDouble());
                System.out.println("Luas kubus: " + k.hitungLuas());
                System.out.println("Volume kubus: " + k.hitungVolume());

            } else if (pilih == 2) {
                System.out.print("Masukkan panjang: ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = sc.nextDouble();
                Balok b = new Balok(p, l, t);
                System.out.println("Luas balok: " + b.hitungLuas());
                System.out.println("Volume balok: " + b.hitungVolume());

            } else if (pilih == 3) {
                System.out.print("Masukkan jari-jari bola: ");
                Bola bo = new Bola(sc.nextDouble());
                System.out.println("Luas bola: " + bo.hitungLuas());
                System.out.println("Volume bola: " + bo.hitungVolume());

            } else if (pilih == 4) {
                System.out.print("Masukkan jari-jari tabung: ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double t = sc.nextDouble();
                Tabung tab = new Tabung(r, t);
                System.out.println("Luas tabung: " + tab.hitungLuas());
                System.out.println("Volume tabung: " + tab.hitungVolume());

            } else if (pilih == 5) {
                System.out.print("Masukkan sisi persegi: ");
                Persegi per = new Persegi(sc.nextDouble());
                System.out.println("Luas persegi: " + per.hitungLuas());
                System.out.println("Keliling persegi: " + per.hitungKeliling());

            } else if (pilih == 6) {
                System.out.print("Masukkan panjang: ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p, l);
                System.out.println("Luas persegi panjang: " + pp.hitungLuas());
                System.out.println("Keliling persegi panjang: " + pp.hitungKeliling());

            } else if (pilih == 7) {
                System.out.print("Masukkan jari-jari lingkaran: ");
                Lingkaran ling = new Lingkaran(sc.nextDouble());
                System.out.println("Luas lingkaran: " + ling.hitungLuas());
                System.out.println("Keliling lingkaran: " + ling.hitungKeliling());

            } else if (pilih == 8) {
                System.out.print("Masukkan sisi 1 trapesium: ");
                double a = sc.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double b = sc.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double c = sc.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double d = sc.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double t = sc.nextDouble();
                Trapesium tr = new Trapesium(a, b, c, d, t);
                System.out.println("Luas trapesium: " + tr.hitungLuas());
                System.out.println("Keliling trapesium: " + tr.hitungKeliling());

            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.println("----------------------------------------");
            sc.close();
        }
    }
}
