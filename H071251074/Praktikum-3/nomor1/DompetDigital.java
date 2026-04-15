package nomor1;
public class DompetDigital {
    private double saldo;
    private Integer pin;
    protected String idNasabah;
    String statusAkun;

    public DompetDigital(String idNasabah, Integer pin) {
        this.idNasabah = idNasabah;
        this.pin = pin;
        this.saldo = 0;
        this.statusAkun = "AKTIF";
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getStatusAkun() {
        return statusAkun;
    }

    public void setUbahPin(Integer pinLama, Integer pinBaru) {
        if (this.pin == pinLama) {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah.");
        } else if (this.pin != pinLama) {
            System.out.println("Gagal: PIN lama salah!");
        } else {
            System.out.println("Gagal: PIN harus 6 digit!");
        }
    }

    public void setor(double jumlah) {
        if (jumlah < 1) {
            System.out.println("Gagal: Nominal tidak valid!");
            logTransaksi("Setor gagal");
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil: " + jumlah);
            logTransaksi("Setor berhasil");
        }
    }

    public void tarik(double jumlah, Integer inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("Gagal: PIN salah!");
            logTransaksi("Tarik gagal - PIN salah");
        } else if (jumlah > saldo) {
            System.out.println("Gagal: Saldo tidak cukup!");
            logTransaksi("Tarik gagal - saldo kurang");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil: " + jumlah);
            logTransaksi("Tarik berhasil");
        }
    }

    private void logTransaksi(String pesan) {
        System.out.println("Catatan: " + pesan);
    }
}