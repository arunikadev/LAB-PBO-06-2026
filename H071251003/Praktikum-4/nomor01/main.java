package nomor01;

import java.util.Scanner;

public class main extends classes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("      ===== Bangun Ruang =====      ");
        System.out.println("1.) Kubus \n2.) Balok \n3.) Bola \n4.) Tabung\n");
        System.out.println("      ===== Bangun Datar =====      ");
        System.out.println("5.) Persegi \n6.) Persegi Panjang \n7.) Lingkaran \n8.) Trapesium");
        System.out.println("--------------------------------------------");
        System.out.print("Pilihan: "); int opsi = input.nextInt();

        switch (opsi) {
            case 1:
                System.out.print("Masukkan nilai rusuk: ");
                int sisi = input.nextInt();
                Kubus k = new Kubus();
                k.sisi = sisi;
                System.out.println("Luas Permukaan: " + k.luas());
                System.out.println("Volume: " + k.volume());
                break;
            case 2:
                System.out.print("Masukkan nilai panjang: ");
                int pan= input.nextInt();
                balok b = new balok();
                b.panjang = pan;
                System.out.print("Masukkan nilai lebar: ");
                b.lebar = input.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                b.tinggi = input.nextInt();
                System.out.println("Luas Permukaan: " + b.luas());
                System.out.println("Volume: " + b.volume());
                break;
            case 3:
                System.out.print("Masukkan nilai jari-jari: ");
                int jarijari = input.nextInt();
                Bola bola = new Bola();
                bola.jarijari = jarijari;
                System.out.println("Luas Permukaan: " + bola.luas());
                System.out.println("Volume: " + bola.volume());
            case 4:
                System.out.print("Masukkan nilai jari-jari: ");
                int r = input.nextInt();
                Tabung tabung = new Tabung();
                tabung.jarijari = r;
                System.out.print("Masukkan nilai tinggi: ");
                tabung.tinggi = input.nextInt();
                System.out.println("Luas Permukaan: " + tabung.luas());
                System.out.println("Volume: " + tabung.volume());
                break;
            case 5:
                System.out.print("Masukkan nilai sisi: ");
                int si = input.nextInt();
                Persegi persegi = new Persegi();
                persegi.sisi = si;
                System.out.println("Luas Persegi: " + persegi.luas());
                System.out.println("Keliling Persegi: " + persegi.keliling());
                break;
            case 6:
                System.out.print("Masukkan nilai panjang: ");
                int panjang = input.nextInt();
                PersegiPanjang pp = new PersegiPanjang();
                pp.panjang = panjang;
                System.out.print("Masukkan nilai lebar: ");
                pp.lebar = input.nextInt();
                System.out.println("Luas Persegi Panjang: " + pp.luas());
                System.out.println("Keliling Persegi Panjang: " + pp.keliling());
                break;
            case 7:
                System.out.print("Masukkan nilai jari-jari: ");
                Lingkaran lingkaran = new Lingkaran();
                int rLingkaran = input.nextInt();
                lingkaran.jarijari = rLingkaran;
                System.out.println("Luas Lingkaran: " + lingkaran.luas());
                System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium: ");
                Trapesium trapesium = new Trapesium();
                int s1 = input.nextInt();
                trapesium.s1 = s1;
                System.out.print("Masukkan sisi 2 trapesium: ");
                int s2 = input.nextInt();
                trapesium.s2 = s2;
                System.out.print("Masukkan sisi 3 trapesium: ");
                int s3 = input.nextInt();
                trapesium.s3 = s3;
                System.out.print("Masukkan sisi 4 trapesium: ");
                int s4 = input.nextInt();
                trapesium.s4 = s4;
                System.out.print("Masukkan tinggi trapesium: ");
                int tinggi = input.nextInt();
                trapesium.tinggi = tinggi;
                System.out.println("Luas Trapesium: " + trapesium.luas());
                System.out.println("Keliling Trapesium: " + trapesium.keliling());
                break;
            default:
                System.out.println("Opsi tidak valid.");
        }
    }
}