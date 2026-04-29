package number1;

class Kubus extends Bangun {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    double hitungLuas() {
        return 6 * sisi * sisi;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}