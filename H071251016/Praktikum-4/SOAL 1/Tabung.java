class Tabung extends Bangun {
    double r,t;
    Tabung(double r,double t){
        this.r=r; this.t=t;
    }

    double volume(){ return Math.PI*r*r*t; }
}