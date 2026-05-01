public class SmartCCTV extends PerangkatElektronik implements InteraksiInternet{
    public SmartCCTV(String merk,  int dayaListrik){
        super(merk, dayaListrik);
    }
    @Override
    public void cekFungsi(){
        System.out.println("SmartCCTV digunakan untuk memantau keamanan rumah.");
    }

    @Override
    public void hubungkanWiFi(){
        System.out.println("Mengirim data ke server...");
    }
}