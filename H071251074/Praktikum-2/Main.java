public class Main {
    public static void main(String[] args) {

        Mesin mesin1 = new Mesin(900, 1.1);
        Mesin mesin2 = new Mesin(880, 1.1);

        Driver d1 = new Driver("Verstappen", 1.2);
        Driver d2 = new Driver("Hamilton", 1.1);

        Mobil mobil1 = new Mobil("Ferrari", mesin1, d1);
        Mobil mobil2 = new Mobil("McLaren", mesin2, d2);

        double FINISH = 5.0;
        int ronde = 1;

        System.out.println("=== BALAPAN DIMULAI ===");

        while (mobil1.jarak < FINISH && mobil2.jarak < FINISH) {

            System.out.println("\n===== RONDE " + ronde + " =====");

            mobil1.gas();
            mobil2.gas();

            mobil1.jalan();
            mobil2.jalan();

            mobil1.tampilStatus(mobil1);
            mobil2.tampilStatus(mobil2);

            ronde++;
        }

        System.out.println("\n=== BALAPAN SELESAI ===");

        if (mobil1.jarak > mobil2.jarak) {
            System.out.println("Pemenang: " + mobil1.nama + " (" + mobil1.driver.nama + ")");
        } else {
            System.out.println("Pemenang: " + mobil2.nama + " (" + mobil2.driver.nama + ")");
        }
    }
}