public class DompetDigital {
    private String nasabahId;
    private String pin;
    private int failedPinAttempts;
    protected String namaPemilik;
    String statusAkun; // package-private internal setting
    double saldo;
    
    public DompetDigital(String nasabahId, String pin, String namaPemilik) {
        this.nasabahId = nasabahId;
        this.pin = pin;
        this.namaPemilik = namaPemilik;
        this.statusAkun = "AKTIF";
        this.saldo = 0;
        this.failedPinAttempts = 0;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    private double getSaldo() {
        return saldo;
    }

    public double getTampil(){
        return getSaldo();
    }

    public void changePin(String oldPin, String newPin) {
        if (!this.pin.equals(oldPin)) {
            logTransaksi("Gagal mengganti PIN: PIN lama salah.");
            System.out.println("Perubahan PIN ditolak: PIN lama tidak cocok.");
            return;
        }

        if (newPin == null || newPin.length() != 6) {
            logTransaksi("Gagal mengganti PIN: PIN baru tidak valid.");
            System.out.println("Perubahan PIN ditolak: PIN baru harus tepat 6 karakter.");
            return;
        }

        this.pin = newPin;
        logTransaksi("PIN berhasil diubah.");
        System.out.println("PIN berhasil diperbarui.");
    }

    public void setorTunai(double jumlah) {
        if (jumlah <= 0) {
            logTransaksi("Gagal setor: nominal tidak valid.");
            System.out.println("Setor tunai ditolak: nominal harus lebih besar dari 0.");
            return;
        }

        saldo += jumlah;
        logTransaksi("Setor tunai berhasil: " + jumlah);
        System.out.println("Setor tunai berhasil: Rp " + jumlah);
    }

    public void tarikTunai(double jumlah, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            failedPinAttempts++;
            logTransaksi("Gagal tarik: PIN salah.");
            System.out.println("Tarik tunai ditolak: PIN salah.");
            return;
        }

        if (jumlah <= 0) {
            logTransaksi("Gagal tarik: nominal tidak valid.");
            System.out.println("Tarik tunai ditolak: nominal harus lebih besar dari 0.");
            return;
        }

        if (jumlah > saldo) {
            logTransaksi("Gagal tarik: saldo tidak mencukupi.");
            System.out.println("Tarik tunai ditolak: saldo tidak mencukupi.");
            return;
        }

        saldo -= jumlah;
        logTransaksi("Tarik tunai berhasil: " + jumlah);
        System.out.println("Tarik tunai berhasil: Rp " + jumlah);
    }

    private void logTransaksi(String pesan) {
        System.out.println("[LOG] " + pesan);
    }
}
