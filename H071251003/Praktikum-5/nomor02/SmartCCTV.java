package nomor02;

class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {
    public SmartCCTV(String merk, int daya) { this.merk = merk; this.dayaListrik = daya; }
    
    public void cekFungsi() { System.out.println("CCTV aktif mengawasi."); }
    
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}
