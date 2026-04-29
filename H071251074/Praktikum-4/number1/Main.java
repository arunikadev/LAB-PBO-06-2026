package number1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");

        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");

        System.out.print("Pilihan: ");
        String pilih = input.next();

        if (pilih.equals("1")) {
            System.out.print("Masukkan sisi: ");
            double s = input.nextDouble();
            
            Kubus kubus = new Kubus(s);

            System.out.printf("Luas: %.2f\n", kubus.hitungLuas());
            System.out.printf("Volume: %.2f", kubus.hitungVolume());}

        else if (pilih.equals("2")) {
            System.out.print("Masukkan panjang balok: ");
            double p = input.nextDouble();
            System.out.print("Masukkan lebar balok: ");
            double l = input.nextDouble();
            System.out.print("Masukkan tinggi balok: ");
            double tbalok = input.nextDouble();

            Balok balok = new Balok(p, l, tbalok);

            System.out.printf("Luas: %.2f\n", balok.hitungLuas());
            System.out.printf("Volume: %.2f", balok.hitungVolume());}

        else if (pilih.equals("3")) {
            System.out.print("Masukkan jari-jari: ");
            double rbola = input.nextDouble();

            Bola bola = new Bola(rbola);

            System.out.printf("Luas: %.2f\n", bola.hitungLuas());
            System.out.printf("Volume: %.2f", bola.hitungVolume());}

        else if (pilih.equals("4")) {
            System.out.print("Masukkan jari-jari: ");
            double rtabung = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double ttabung = input.nextDouble();

            Tabung tabung = new Tabung(rtabung, ttabung);

            System.out.printf("Luas: %.2f\n", tabung.hitungLuas());
            System.out.printf("Volume: %.2f", tabung.hitungVolume());}
            
        else if (pilih.equals("5")) {
            System.out.print("Masukkan sisi: ");
            double spersegi = input.nextDouble();
            
            Persegi persegi = new Persegi(spersegi);

            System.out.printf("Luas: %.2f\n", persegi.hitungLuas());
            System.out.printf("Keliling: %.2f", persegi.hitungKeliling());}

        else if (pilih.equals("6")) {
            System.out.print("Masukkan panjang: ");
            double ppanjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lpanjang = input.nextDouble();
            
            PersegiPanjang persegi_panjang = new PersegiPanjang(ppanjang, lpanjang);

            System.out.printf("Luas: %.2f\n", persegi_panjang.hitungLuas());
            System.out.printf("Keliling: %.2f", persegi_panjang.hitungKeliling());}

        else if (pilih.equals("7")) {
            System.out.print("Masukkan jari-jari: ");
            double rlingkaran = input.nextDouble();
            
            Lingkaran lingkaran = new Lingkaran(rlingkaran);

            System.out.printf("Luas: %.2f\n", lingkaran.hitungLuas());
            System.out.printf("Keliling: %.2f", lingkaran.hitungKeliling());}

        else if (pilih.equals("8")) {
            System.out.print("Masukkan sisi 1: ");
            double a = input.nextDouble();
            System.out.print("Masukkan sisi 2: ");
            double b = input.nextDouble();
            System.out.print("Masukkan sisi 3: ");
            double c = input.nextDouble();
            System.out.print("Masukkan sisi 4: ");
            double d = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t_trapesium = input.nextDouble();

            Trapesium trapesium = new Trapesium(a,b,c,d,t_trapesium);

            System.out.printf("Luas: %.2f\n", trapesium.hitungLuas());
            System.out.printf("Keliling: %.2f", trapesium.hitungKeliling());}

        else {
            System.out.println("Pilihan tidak valid");}
        
    input.close();
    }
}