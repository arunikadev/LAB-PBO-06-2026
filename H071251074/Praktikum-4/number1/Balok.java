package number1;

class Balok extends Bangun {
    double p, l, t;
    
    Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    double hitungLuas() {
        return 2 * (p*l + p*t + l*t);
    }
    
    double hitungVolume() {
        return p * l * t;
    }
}