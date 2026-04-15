
public class DompetDigital {
    
   
    private int pin;          
    private double saldo;       
    protected String idNasabah;  

    String namaAplikasi = "E-Wallet"; 

    
    public DompetDigital(String idNasabah, int pin) {
        this.idNasabah = idNasabah;
        this.pin = pin;
        this.saldo = 0; 
    }

    
    public String getIdNasabah() {
        return idNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void ubahPin(int pinLama, int pinBaru) {
    if (this.pin != pinLama) {
        System.out.println("❌ PIN lama salah!");
    } 
    else if (pinBaru < 100000 || pinBaru > 999999) {
        System.out.println("❌ PIN baru harus 6 digit!");
    } 
    else {
        this.pin = pinBaru;
        System.out.println("✅ PIN berhasil diubah!");
    }
}

    
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            logTransaksi("Gagal setor: nominal tidak valid");
        } else {
            saldo += jumlah;
            logTransaksi("Berhasil setor: " + jumlah);
        }
    }

    
    public void tarik(double jumlah, int inputPin) {
        if (this.pin != inputPin) {
            logTransaksi("Gagal tarik: PIN salah");
        } else if (jumlah > saldo) {
            logTransaksi("Gagal tarik: saldo tidak cukup");
        } else {
            saldo -= jumlah;
            logTransaksi("Berhasil tarik: " + jumlah);
        }
    }

    
    private void logTransaksi(String pesan) {
        System.out.println("[LOG] " + pesan);
    }
}
