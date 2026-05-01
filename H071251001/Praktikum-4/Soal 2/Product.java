class Product{
    protected String merk;
    protected int nomorSerie;
    protected double harga;


    public Product (String merk, int nomorSerie,double harga){
        this.merk = merk;
        this.nomorSerie = nomorSerie;
        this.harga = harga;
    }
    public int getnomorSeri(){
        return nomorSerie;
    }

    public void tampilkanInfo(){
        System.out.println("Merk:"+ merk);
        System.out.println("Nomor Seri:" + nomorSerie);
        System.out.println("Harga:" + harga);
    }
}