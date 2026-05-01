class Smartphone extends Product{
    private double ukuranLayar;
    private int kapasitasPenyimpanan;

    public Smartphone(String merk, int nomorSeri, double harga, 
        double ukuranLayar, int kapasitasPenyimpanan ){

            super(merk, nomorSeri, harga);
            this.ukuranLayar = ukuranLayar;
            this.kapasitasPenyimpanan = kapasitasPenyimpanan;

        }
         @Override
            public void tampilkanInfo(){
                super.tampilkanInfo();
                System.out.println("Ukuran Layar:" + ukuranLayar + "inch");
                System.out.println("Kapasitas Penyimpanan:" + kapasitasPenyimpanan + "GB");
            }

}