class DompetDigital{

    private String pin;
    private double saldo;

    protected String idNasabah;

    String statusAkun;

    // CONSTRUCTOR
    public DompetDigital (String idNasabah, String pinAwal){
        this.idNasabah = idNasabah;
        this.pin = pinAwal;
        this.saldo = 0;
        this.statusAkun = "aktif";
    }

        // GETTER
        public String getIdNasabah(){
            return idNasabah;
        }

        public double getSaldo(){
            return saldo;
        }


        public void setPin(String pinLama, String pinBaru){
            if (!this.pin.equals (pinLama)){
                System.out.println("PIN lama salah!");
            }else if (pinBaru.length()!=6){
                System.out.println("PIN baru harus 6 karakter!");
            }else {
                this.pin = pinBaru;
                System.out.println("PIN berhasil diubah.");
            }
        }

        private void setor (double jumlah) {
            if (jumlah <= 0){
                System.out.println("Setor gagal! Nominal tidak valid.");
                logTransaksi("Setor gagal");
            }else{
                saldo =+ jumlah;
                System.out.println("Setor berhasil");
                logTransaksi("Setor Berhasil");
            }
        }

        public void getSetor(double jumlah){
            setor(jumlah);
        }


        // TRANSAKSI
        public void tarik (double jumlah , String inputPin){
            if (!this.pin.equals (inputPin)){
                System.out.println("PIN salah");
                logTransaksi("Tarik gagal - PIN salah");
            }else if (jumlah > saldo){
                System.out.println("saldo tidak cukup");
                logTransaksi ("Tarik gagal - Saldo kurang");
            }else{
                saldo -= jumlah;
                System.out.println("Tarik berhasil");
                logTransaksi("Tarik berhasil");
            }
        }
        private void logTransaksi(String Pesan){
            System.out.println("[LOG]"+ Pesan);
        }
    }
