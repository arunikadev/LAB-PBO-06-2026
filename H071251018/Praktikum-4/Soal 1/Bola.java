public class Bola extends BangunRuang {
    double r;

    public Bola(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return 4 * Math.PI * r * r;
    }

    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * r * r * r;
    }
}
