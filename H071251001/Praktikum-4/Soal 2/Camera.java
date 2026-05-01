class Camera extends Product{
private int resolusi;
private String jenisLensa;

public Camera(String merk, int nomorSeri, double harga, int resolusi, String jenisLensa){
    super(merk, nomorSeri, harga);
    this.resolusi = resolusi;
    this.jenisLensa = jenisLensa;
}


@Override
public void tampilkanInfo(){
    super.tampilkanInfo();
    System.out.println("Resolusi:" + resolusi + "MP");
    System.out.println("Jenis Lensa:" + jenisLensa);
}


}