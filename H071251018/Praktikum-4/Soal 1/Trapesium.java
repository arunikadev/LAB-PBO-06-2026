public class Trapesium extends BangunDatar {
    double a, b, c, d, t;

    public Trapesium(double a, double b, double c, double d, double t) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.t = t;
    }

    public double hitungLuas() {
        return 0.5 * (a + b) * t;
    }

    public double hitungKeliling() {
        return a + b + c + d;
    }
}
