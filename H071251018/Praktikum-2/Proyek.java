public class Proyek {
    public String namaProyek;
    public int deadlineHari;

    public Proyek() {}

    public Proyek(String namaProyek, int deadlineHari) {
        this.namaProyek = namaProyek;
        this.deadlineHari = deadlineHari;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public int getDeadlineHari() {
        return deadlineHari;
    }
}