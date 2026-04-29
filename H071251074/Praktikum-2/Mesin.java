public class Mesin {
    double tenaga;
    double efisiensi;

    public Mesin() {
        tenaga = 900;
        efisiensi = 1.0;
    }

    public Mesin(double tenaga, double efisiensi) {
        this.tenaga = tenaga;
        this.efisiensi = efisiensi;
    }

    void kurangiTenaga(double jumlah) {
        tenaga -= jumlah;
        if (tenaga < 300) tenaga = 300;
    }

    void tambahTenaga(double jumlah) {
        tenaga += jumlah;
        if (tenaga > 1000) tenaga = 1000;
    }
}