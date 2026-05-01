class Laptop extends Product{
private int ukuranRAM;
private String jenisProcessor;

public Laptop(String merk, int nomorSeri,double harga, int ukuranRAM, String jenisProcessor){
    super(merk, nomorSeri, harga);
    this.ukuranRAM = ukuranRAM;
    this.jenisProcessor  = jenisProcessor;
}

@Override
public void tampilkanInfo(){
    super.tampilkanInfo();
    System.out.println("Ukuran RAM:" + ukuranRAM + "GB");
    System.out.println("Jenis Processor" + jenisProcessor);
}

}