import java.util.Random;

public class Mobil {
    String nama;
    double kecepatan;
    double jarak;
    Mesin mesin;
    Driver driver;

    Random rand = new Random();

    public Mobil() {
        nama = "Mobil Default";
        kecepatan = 0;
        jarak = 0;
        mesin = new Mesin();
        driver = new Driver();
    }

    public Mobil(String nama, Mesin mesin, Driver driver) {
        this.nama = nama;
        this.mesin = mesin;
        this.driver = driver;
        this.kecepatan = 0;
        this.jarak = 0;
    }

    void gas() {
        double base = 200;
        double variasi = rand.nextDouble() * 60;
        double faktor = (mesin.tenaga / 1000) * driver.skill;

        kecepatan = base + (variasi * faktor);
    }

    void jalan() {
        jarak += kecepatan / 360;
    }

    void tampilStatus(Mobil mobil) {
        System.out.println("=========== " + mobil.nama + " Status ===========");
        System.out.println("Driver      : " + driver.nama);
        System.out.println("Kecepatan   : " + String.format("%.2f", kecepatan) + " km/h");
        System.out.println("Jarak       : " + String.format("%.2f", jarak) + " km");
        System.out.println("=====================================");
    }
}