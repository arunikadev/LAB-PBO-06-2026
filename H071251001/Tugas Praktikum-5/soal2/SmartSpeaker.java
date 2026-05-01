public class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara{
    public SmartSpeaker(String merk, int dayaListrik){
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi(){
        System.out.println("SmartSpeaker digunakan untuk memutar musik dan asisten virtual.");
    }

    @Override
    public void hubungkanWiFi(){
        System.out.println("SmartSpeaker terhubung ke jaringan WiFI.");
    }

    @Override
    public void prosesPerintah(String perintah){
        System.out.println("Memproses perintah Suara:" + perintah);
    }
}