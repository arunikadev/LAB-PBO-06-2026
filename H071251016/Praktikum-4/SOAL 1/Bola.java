class Bola extends Bangun {
    double r;
    Bola(double r){ this.r=r; }

    double volume(){ return (4.0/3)*Math.PI*r*r*r; }
}