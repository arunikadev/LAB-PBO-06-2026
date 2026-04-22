package number1;

class PersegiPanjang extends Bangun {
    double p, l;

    PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    double hitungLuas() {
        return p * l;
    }

    double hitungKeliling() {
        return 2 * (p + l);
    }
}