package number1;

class Persegi extends Bangun {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    double hitungKeliling() {
        return 4 * sisi;
    }
}