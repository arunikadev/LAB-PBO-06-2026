public class PersegiPanjang extends BangunDatar {
    double p, l;

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double hitungLuas() {
        return p * l;
    }

    public double hitungKeliling() {
        return 2 * (p + l);
    }
}
