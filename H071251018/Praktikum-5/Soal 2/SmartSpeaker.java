public class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {

    public SmartSpeaker(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println(merk + " - SmartSpeaker aktif dan siap.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println(merk + " terhubung ke WiFi.");
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println(merk + " menerima perintah: " + perintah);
    }
}
