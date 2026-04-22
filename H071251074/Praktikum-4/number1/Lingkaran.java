package number1;

class Lingkaran extends Bangun {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    double hitungLuas() {
        return super.phi * r * r;
    }

    double hitungKeliling() {
        return 2 * super.phi * r;
    }
}