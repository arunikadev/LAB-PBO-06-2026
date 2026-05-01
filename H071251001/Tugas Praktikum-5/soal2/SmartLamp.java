public class SmartLamp extends PerangkatElektronik implements KontrolSuara {
    public SmartLamp(String merk, int dayaListrik){
        super(merk, dayaListrik);
    }
    @Override
    public void cekFungsi(){
        System.out.println("SmartLamp digunakan untuk penerangan otomatis.");
    }

    @Override
    public void prosesPerintah(String perintah){
        if(perintah.equalsIgnoreCase("NYALA")){
            System.out.println("Lampu Berpijar!");
        }else {
            System.out.println("Perintah tidak dikenali.");
        }
    }
}