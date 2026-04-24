import java.util.Scanner;

public class Geometri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU PILIH BANGUN ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");
        System.out.print("Masukkan pilihan: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                BangunKubus kubus = new BangunKubus();
                kubus.isi();
                kubus.hitungLuas();
                kubus.hitungVolume();
                break;

            case 2:
                BangunBalok balok = new BangunBalok();
                balok.isi();
                balok.hitungLuas();
                balok.hitungVolume();
                break;

            case 3:
                BangunBola bola = new BangunBola();
                bola.isi();
                bola.hitungLuas();
                bola.hitungVolume();
                break;

            case 4:
                BangunTabung tabung = new BangunTabung();
                tabung.isi();
                tabung.hitungLuas();
                tabung.hitungVolume();
                break;

            case 5:
                DatarPersegi persegi = new DatarPersegi();
                persegi.isi();
                persegi.hitungKeliling();
                persegi.hitungLuas();
                break;

            case 6:
                DatarPersegiPanjang pp = new DatarPersegiPanjang();
                pp.isi();
                pp.hitungKeliling();
                pp.hitungLuas();
                break;

            case 7:
                DatarLingkaran lingkaran = new DatarLingkaran();
                lingkaran.isi();
                lingkaran.hitungKeliling();
                lingkaran.hitungLuas();
                break;

            case 8:
                DatarTrapesium trapesium = new DatarTrapesium();
                trapesium.isi();
                trapesium.hitungKeliling();
                trapesium.hitungLuas();
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}

class BaseData {
    Scanner input = new Scanner(System.in);

    double x, y, z, r, t, p, l;
    final double PHI = 3.14;
}

class BangunKubus extends BaseData {
    void isi() {
        System.out.print("Masukkan sisi: ");
        x = input.nextDouble();
    }

    void hitungLuas() {
        System.out.println("Luas = " + (6 * x * x));
    }

    void hitungVolume() {
        System.out.println("Volume = " + (x * x * x));
    }
}

class BangunBalok extends BaseData {
    void isi() {
        System.out.print("Panjang: ");
        p = input.nextDouble();
        System.out.print("Lebar  : ");
        l = input.nextDouble();
        System.out.print("Tinggi : ");
        t = input.nextDouble();
    }
    void hitungLuas() {
        System.out.println("Luas = " + (2 * (p * l + p * t + l * t)));
    }
    void hitungVolume() {
        System.out.println("Volume = " + (p * l * t));
    }
}

class BangunBola extends BaseData {
    void isi() {
        System.out.print("Radius: ");
        r = input.nextDouble();
    }
    void hitungLuas() {
        System.out.println("Luas = " + (4 * PHI * r * r));
    }
    void hitungVolume() {
        System.out.println("Volume = " + ((4.0 / 3) * PHI * r * r * r));
    }
}

class BangunTabung extends BaseData {
    void isi() {
        System.out.print("Radius: ");
        r = input.nextDouble();
        System.out.print("Tinggi: ");
        t = input.nextDouble();
    }
    void hitungLuas() {
        System.out.println("Luas = " + (2 * PHI * r * (r + t)));
    }
    void hitungVolume() {
        System.out.println("Volume = " + (PHI * r * r * t));
    }
}

class DatarPersegi extends BaseData {
    void isi() {
        System.out.print("Sisi: ");
        x = input.nextDouble();
    }
    void hitungKeliling() {
        System.out.println("Keliling = " + (4 * x));
    }
    void hitungLuas() {
        System.out.println("Luas = " + (x * x));
    }
}

class DatarPersegiPanjang extends BaseData {
    void isi() {
        System.out.print("Panjang: ");
        p = input.nextDouble();
        System.out.print("Lebar  : ");
        l = input.nextDouble();
    }
    void hitungKeliling() {
        System.out.println("Keliling = " + (2 * (p + l)));
    }
    void hitungLuas() {
        System.out.println("Luas = " + (p * l));
    }
}

class DatarLingkaran extends BaseData {
    void isi() {
        System.out.print("Radius: ");
        r = input.nextDouble();
    }
    void hitungKeliling() {
        System.out.println("Keliling = " + (2 * PHI * r));
    }
    void hitungLuas() {
        System.out.println("Luas = " + (PHI * r * r));
    }
}

class DatarTrapesium extends BaseData {
    double s1, s2, s3, s4;

    void isi() {
        System.out.print("Sisi 1: ");
        s1 = input.nextDouble();
        System.out.print("Sisi 2: ");
        s2 = input.nextDouble();
        System.out.print("Sisi 3: ");
        s3 = input.nextDouble();
        System.out.print("Sisi 4: ");
        s4 = input.nextDouble();
        System.out.print("Sisi sejajar 1: ");
        x = input.nextDouble();
        System.out.print("Sisi sejajar 2: ");
        y = input.nextDouble();
        System.out.print("Tinggi: ");
        t = input.nextDouble();
    }
    void hitungKeliling() {
        System.out.println("Keliling = " + (s1 + s2 + s3 + s4));
    }
    void hitungLuas() {
        System.out.println("Luas = " + (0.5 * (x + y) * t));
    }
}