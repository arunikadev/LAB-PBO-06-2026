class Trapesium extends Bangun {
    double a,b,c,d,t;
    Trapesium(double a,double b,double c,double d,double t){
        this.a=a; this.b=b; this.c=c; this.d=d; this.t=t;
    }

    double luas(){ return ((a+b)/2)*t; }
    double keliling(){ return a+b+c+d; }
}