import java.util.Scanner;

public class Tuprak_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------------------------");
        System.out.println("          ===== BANGUN RUANG =====");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println("\n          ===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        System.out.println("---------------------------------------");
        
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        System.out.println("---------------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: "); double sKubus = sc.nextDouble();
                Kubus kb = new Kubus(sKubus);
                System.out.println("Luas kubus: " + kb.luas() + "\nVolume kubus: " + kb.volume());
                break;
            case 2:
                System.out.print("P: "); double pBalok = sc.nextDouble();
                System.out.print("L: "); double lBalok = sc.nextDouble();
                System.out.print("T: "); double tBalok = sc.nextDouble();
                Balok blk = new Balok(pBalok, lBalok, tBalok);
                System.out.println("Luas balok: " + blk.luas() + "\nVolume balok: " + blk.volume());
                break;
            case 3:
                System.out.print("Jari-jari bola: "); double rBola = sc.nextDouble();
                Bola bo = new Bola(rBola);
                System.out.println("Luas bola: " + bo.luas() + "\nVolume bola: " + bo.volume());
                break;
            case 4:
                System.out.print("Jari-jari: "); double rTabung = sc.nextDouble();
                System.out.print("Tinggi: "); double tTabung = sc.nextDouble();
                Tabung tb = new Tabung(rTabung, tTabung);
                System.out.println("Luas tabung: " + tb.luas() + "\nVolume tabung: " + tb.volume());
                break;
            case 5:
                System.out.print("Sisi persegi: "); double sPersegi = sc.nextDouble();
                Persegi ps = new Persegi(sPersegi);
                System.out.println("Luas: " + ps.luas() + "\nKeliling: " + ps.keliling());
                break;
            case 6:
                System.out.print("Panjang: "); double pPP = sc.nextDouble();
                System.out.print("Lebar: "); double lPP = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(pPP, lPP);
                System.out.println("Luas: " + pp.luas() + "\nKeliling: " + pp.keliling());
                break;
            case 7:
                System.out.print("Jari-jari lingkaran: "); double rLing = sc.nextDouble();
                Lingkaran ln = new Lingkaran(rLing);
                System.out.println("Luas: " + ln.luas() + "\nKeliling: " + ln.keliling());
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium: "); double s1 = sc.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: "); double s2 = sc.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: "); double s3 = sc.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: "); double s4 = sc.nextDouble();
                System.out.print("Masukkan tinggi trapesium: "); double tTrap = sc.nextDouble();
                Trapesium tr = new Trapesium(s1, s2, s3, s4, tTrap);
                System.out.println("Luas trapesium: " + tr.luas() + "\nKeliling trapesium: " + tr.keliling());
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }




// Superclass
class Bangun {
    String nama;
    Bangun(String nama) { this.nama = nama; }
}

// --- BANGUN RUANG ---
class Kubus extends Bangun {
    double s;
    Kubus(double s) { super("Kubus"); this.s = s; }
    double luas() { return 6 * s * s; }
    double volume() { return Math.pow(s, 3); }
}

class Balok extends Bangun {
    double p, l, t;
    Balok(double p, double l, double t) { super("Balok"); this.p = p; this.l = l; this.t = t; }
    double luas() { return 2 * (p * l + p * t + l * t); }
    double volume() { return p * l * t; }
}

class Bola extends Bangun {
    double r;
    Bola(double r) { super("Bola"); this.r = r; }
    double luas() { return 4 * Math.PI * r * r; }
    double volume() { return (4.0 / 3.0) * Math.PI * Math.pow(r, 3); }
}

class Tabung extends Bangun {
    double r, t;
    Tabung(double r, double t) { super("Tabung"); this.r = r; this.t = t; }
    double luas() { return 2 * Math.PI * r * (r + t); }
    double volume() { return Math.PI * r * r * t; }
}

// --- BANGUN DATAR ---
class Persegi extends Bangun {
    double s;
    Persegi(double s) { super("Persegi"); this.s = s; }
    double luas() { return s * s; }
    double keliling() { return 4 * s; }
}

class PersegiPanjang extends Bangun {
    double p, l;
    PersegiPanjang(double p, double l) { super("Persegi Panjang"); this.p = p; this.l = l; }
    double luas() { return p * l; }
    double keliling() { return 2 * (p + l); }
}

class Lingkaran extends Bangun {
    double r;
    Lingkaran(double r) { super("Lingkaran"); this.r = r; }
    double luas() { return Math.PI * r * r; }
    double keliling() { return 2 * Math.PI * r; }
}

class Trapesium extends Bangun {
    double s1, s2, s3, s4, t;
    Trapesium(double s1, double s2, double s3, double s4, double t) {
        super("Trapesium");
        this.s1 = s1; this.s2 = s2; this.s3 = s3; this.s4 = s4; this.t = t;
    }
    double luas() { return 0.5 * (s1 + s2) * t; }
    double keliling() { return s1 + s2 + s3 + s4; }
    }
}