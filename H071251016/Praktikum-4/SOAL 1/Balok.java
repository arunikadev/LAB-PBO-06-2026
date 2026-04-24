class Balok extends Bangun {
    double p,l,t;
    Balok(double p,double l,double t){
        this.p=p; this.l=l; this.t=t;
    }

    double volume(){ return p*l*t; }
}