import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");

        System.out.print("Pilihan: ");
        int pilih = sc.nextInt();

        switch(pilih){

            case 1:
                System.out.print("Masukkan sisi: ");
                double s = sc.nextDouble();
                Kubus k = new Kubus(s);
                System.out.println("Volume kubus: " + k.volume());
                break;

            case 2:
                System.out.print("Panjang: ");
                double p = sc.nextDouble();
                System.out.print("Lebar: ");
                double l = sc.nextDouble();
                System.out.print("Tinggi: ");
                double t = sc.nextDouble();
                Balok b = new Balok(p,l,t);
                System.out.println("Volume balok: " + b.volume());
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double r = sc.nextDouble();
                Bola bola = new Bola(r);
                System.out.println("Volume bola: " + bola.volume());
                break;

            case 4:
                System.out.print("Jari-jari: ");
                r = sc.nextDouble();
                System.out.print("Tinggi: ");
                t = sc.nextDouble();
                Tabung tb = new Tabung(r,t);
                System.out.println("Volume tabung: " + tb.volume());
                break;

            case 5:
                System.out.print("Masukkan sisi: ");
                s = sc.nextDouble();
                Persegi ps = new Persegi(s);
                System.out.println("Luas: " + ps.luas());
                System.out.println("Keliling: " + ps.keliling());
                break;

            case 6:
                System.out.print("Panjang: ");
                p = sc.nextDouble();
                System.out.print("Lebar: ");
                l = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p,l);
                System.out.println("Luas: " + pp.luas());
                System.out.println("Keliling: " + pp.keliling());
                break;

            case 7:
                System.out.print("Jari-jari: ");
                r = sc.nextDouble();
                Lingkaran lg = new Lingkaran(r);
                System.out.println("Luas: " + lg.luas());
                System.out.println("Keliling: " + lg.keliling());
                break;

            case 8:
                System.out.print("Sisi 1: ");
                double a = sc.nextDouble();
                System.out.print("Sisi 2: ");
                double b1 = sc.nextDouble();
                System.out.print("Sisi 3: ");
                double c = sc.nextDouble();
                System.out.print("Sisi 4: ");
                double d = sc.nextDouble();
                System.out.print("Tinggi: ");
                double tt = sc.nextDouble();

                Trapesium tr = new Trapesium(a,b1,c,d,tt);
                System.out.println("Luas: " + tr.luas());
                System.out.println("Keliling: " + tr.keliling());
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
        sc.close();
    }
}