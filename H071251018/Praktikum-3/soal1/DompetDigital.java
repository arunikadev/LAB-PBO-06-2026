package soal1;
public class DompetDigital {
    private String pin;
    private double saldo;
    protected String idNasabah;
    String statusAkun;

    public DompetDigital(String idNasabah, String pin) {
        if (pin.length() != 6) {
            System.out.println("Gagal membuat akun: PIN harus tepat 6 karakter.");
            this.statusAkun = "nonaktif";
            return;
        }
        this.idNasabah = idNasabah;
        this.pin = pin;
        this.saldo = 0;
        this.statusAkun = "aktif";
        catatLog("Akun baru dibuat untuk ID: " + idNasabah);
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void updatePin(String pinLama, String pinBaru) {
        if (!"aktif".equals(this.statusAkun)) {
            System.out.println("Akun tidak aktif. Tidak dapat mengubah PIN.");
            return;
        }
        if (!pinLama.equals(this.pin)) {
            System.out.println("PIN lama salah. PIN tidak berhasil diubah.");
            catatLog("Percobaan ubah PIN gagal, PIN lama salah.");
        } else if (pinBaru.length() != 6) {
            System.out.println("PIN baru harus tepat 6 karakter.");
            catatLog("Percobaan ubah PIN gagal, PIN baru tidak 6 karakter.");
        } else {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah.");
            catatLog("PIN berhasil diubah.");
        }
    }

    public void setorTunai(double jumlah) {
        if (!"aktif".equals(this.statusAkun)) {
            System.out.println("Akun tidak aktif. Setor tunai gagal.");
            return;
        }
        if (jumlah <= 0) {
            System.out.println("Setor gagal. Nominal tidak boleh nol atau negatif.");
            catatLog("Setor gagal, nominal ilegal: " + jumlah);
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil. Saldo bertambah Rp" + (long) jumlah);
            catatLog("Setor tunai Rp" + (long) jumlah + " berhasil. Saldo: Rp" + (long) saldo);
        }
    }

    public void tarikTunai(double jumlah, String pinInput) {
        if (!"aktif".equals(this.statusAkun)) {
            System.out.println("Akun tidak aktif. Tarik tunai gagal.");
            return;
        }
        if (!pinInput.equals(this.pin)) {
            System.out.println("PIN salah. Tarik tunai gagal.");
            catatLog("Tarik tunai gagal, PIN salah.");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup. Tarik tunai gagal.");
            catatLog("Tarik tunai gagal, saldo tidak cukup.");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil. Saldo berkurang Rp" + (long) jumlah);
            catatLog("Tarik tunai Rp" + (long) jumlah + " berhasil. Saldo: Rp" + (long) saldo);
        }
    }

    private void catatLog(String pesan) {
        System.out.println("[LOG] " + pesan);
    }
}