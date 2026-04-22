package number1;

class Bola extends Bangun {
    double r;
    
    Bola(double r) {
        this.r = r;
    }

    double hitungLuas() {
        return 4 * super.phi * r * r;
    }

    double hitungVolume() {
        return (4.0/3.0) * super.phi * r * r * r;
    }
}