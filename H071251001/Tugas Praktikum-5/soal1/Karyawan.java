public abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    private int JumlahKehadiran;


    public Karyawan (String nama, String idKaryawan){
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.JumlahKehadiran = 0;
    }

    public void absen(){
        JumlahKehadiran++;
    }

    public String getNama(){
        return nama;
    }

    public String getidKaryawan(){
        return idKaryawan;
    }

    public int getJumlahKehadiran(){
        return JumlahKehadiran;
    }

    public abstract double hitungGaji();
    
}