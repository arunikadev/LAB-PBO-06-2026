package nomor02;

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, IKontrolSuara {
    public SmartSpeaker(String merk, int daya) { this.merk = merk; this.dayaListrik = daya; }
    
    @Override
    public void cekFungsi() { System.out.println("Speaker siap memutar musik."); }
    @Override
    public void hubungkanWiFi() { System.out.println("Speaker terhubung ke cloud."); }
    @Override
    public void prosesPerintah(String perintah) { System.out.println("Speaker memproses: " + perintah); }
}
