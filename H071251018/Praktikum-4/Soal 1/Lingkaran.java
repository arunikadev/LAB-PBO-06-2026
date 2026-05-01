public class Lingkaran extends BangunDatar {
    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return Math.PI * r * r;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}
