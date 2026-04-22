package number1;

class Trapesium extends Bangun {
    double a, b, c, d, tinggi;

    Trapesium(double a, double b, double c, double d, double tinggi) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * (a + b) * tinggi;
    }

    double hitungKeliling() {
        return a + b + c + d;
    }
}