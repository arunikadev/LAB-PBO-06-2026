package nomor02;

class SmartLamp extends PerangkatElektronik implements IKontrolSuara {
    public SmartLamp(String merk, int daya) { this.merk = merk; this.dayaListrik = daya; }
    
    public void cekFungsi() { System.out.println("Lampu pintar siap digunakan."); }
    
    public void prosesPerintah(String perintah) {
        if (perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("Lampu berpijar!");
        }
    }
}
