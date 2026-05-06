public class DompetDigital {
    private String pin;
    private double saldo;
    protected String namaNasabah; 

    private void catatLog(String aktivitas) {
        System.out.println("[LOG SISTEM3] " + aktivitas);
    }

    String mataUang = "IDR";      

    public DompetDigital(String namaNasabah, String pinAwal) {
        this.namaNasabah = namaNasabah;
        this.pin = pinAwal;
        this.saldo = 0;
        catatLog("Akun baru dibuat untuk: " + namaNasabah);
        System.out.println("Selamat datang, " + namaNasabah);
    }

    String getNamaNasabah() {
        return this.namaNasabah;
    }

    public double getSaldo() {
        return this.saldo;
    }

    boolean ubahPin(String pinLama, String pinBaru) {
        if (this.pin.equals(pinLama)) {
            if (pinBaru.length() == 6) {
                this.pin = pinBaru;
                catatLog("PIN berhasil diperbarui.");
                return true;
            } else {
                catatLog("Gagal ubah PIN: Format tidak sesuai.");
                return false;
            }
        }
        catatLog("Gagal ubah PIN: Autentikasi salah.");
        return false;
    }

    private void setorTunai(double nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            catatLog("Setor tunai: +" + "Rp." + nominal);
            System.out.println("Berhasil menambah saldo.");
        } else {
            catatLog("Gagal setor: Nominal tidak valid.");
            System.out.println("Gagal: Nominal harus lebih dari 0.");
        }
    }

    public void getsetorTunai(double nominal) {
        setorTunai(nominal);
    }

    boolean tarikTunai(String inputPin, double nominal) {
        if (this.pin.equals(inputPin)) {
            if (this.saldo >= nominal && nominal > 0) {
                this.saldo -= nominal;
                catatLog("Tarik tunai: -" + nominal);
                return true;
            }
            catatLog("Gagal tarik: Saldo tidak cukup.");
            return false;
        }
        catatLog("Gagal tarik: PIN salah.");
        return false;
    }
}