package nomor02;

abstract class PerangkatElektronik { 
    String merk;
    int dayaListrik;

    public abstract void cekFungsi();

    public void infoPower() {
        System.out.println(merk + " sedang menyedot daya sebesar " + dayaListrik + " Watt.");
    }
}

