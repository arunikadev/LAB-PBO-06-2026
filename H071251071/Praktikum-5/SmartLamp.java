// SmartLamp: extends PerangkatElektronik implements KontrolSuara
class SmartLamp extends PerangkatElektronik implements KontrolSuara {
    public SmartLamp(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println("SmartLamp " + merk + " berfungsi sebagai lampu pintar dengan kontrol suara.");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah.equals("NYALA")) {
            System.out.println("Lampu berpijar!");
        } else {
            System.out.println("Perintah tidak dikenal.");
        }
    }
}