package number1;

class Tabung extends Bangun {
    double r, t;
    
    Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }
    
    double hitungLuas() {
        return 2 * super.phi * r * (r + t);
    }
    
    double hitungVolume() {
        return super.phi * r * r * t;
    }
}