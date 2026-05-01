// SmartCCTV: extends PerangkatElektronik implements InteraksiInternet
class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {
    public SmartCCTV(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println("SmartCCTV " + merk + " berfungsi sebagai kamera pengawas dengan koneksi internet.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}