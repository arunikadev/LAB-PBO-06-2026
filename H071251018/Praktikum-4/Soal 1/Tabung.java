public class Tabung extends BangunRuang {
    double r, t;

    public Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    public double hitungLuas() {
        return 2 * Math.PI * r * (r + t);
    }

    public double hitungVolume() {
        return Math.PI * r * r * t;
    }
}
