public class Klien {
    public String namaKlien;
    public double budget;

    public Klien() {}

    public Klien(String namaKlien, double budget) {
        this.namaKlien = namaKlien;
        this.budget = budget;
    }

    public String getNamaKlien() {
        return namaKlien;
    }

    public double getBudget() {
        return budget;
    }
}