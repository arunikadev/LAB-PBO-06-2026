// SmartSpeaker: extends PerangkatElektronik implements InteraksiInternet, KontrolSuara
class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {
    public SmartSpeaker(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println("SmartSpeaker " + merk + " berfungsi sebagai speaker pintar dengan internet dan kontrol suara.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah.equals("NYALA")) {
            System.out.println("Speaker menyala!");
        } else {
            System.out.println("Perintah tidak dikenal.");
        }
    }
}