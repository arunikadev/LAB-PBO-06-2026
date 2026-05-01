public class Balok extends BangunRuang {
    double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public double hitungLuas() {
        return 2 * (p * l + p * t + l * t);
    }

    public double hitungVolume() {
        return p * l * t;
    }
}
