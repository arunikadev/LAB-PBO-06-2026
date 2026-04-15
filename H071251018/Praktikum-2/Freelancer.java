public class Freelancer {
    public String nama;
    public double ratePerHari;
    public Proyek proyek;
    public Klien klien;

    public Freelancer() {}

    public Freelancer(String nama, double ratePerHari, Proyek proyek, Klien klien) {
        this.nama = nama;
        this.ratePerHari = ratePerHari;
        this.proyek = proyek;
        this.klien = klien;
    }

    public void hitungPenghasilan() {
        double tagihan = this.ratePerHari * this.proyek.getDeadlineHari();
        System.out.println(this.nama + " mengerjakan : " + this.proyek.getNamaProyek());
        System.out.println("Deadline     : " + this.proyek.getDeadlineHari() + " hari");
        System.out.println("Tagihan      : Rp" + (long) tagihan);

        if (this.klien.getBudget() >= tagihan) {
            System.out.println("Status       : Deal! Penghasilan Rp" + (long) tagihan);
        } else {
            System.out.println("Status       : Budget " + this.klien.getNamaKlien() + " tidak cukup.");
        }   
    }

    public void kerjasama(Freelancer rekan) {
        int deadlineKolaborasi = (int) Math.ceil(this.proyek.getDeadlineHari() / 2.0);
        double tagihanSaya = this.ratePerHari * deadlineKolaborasi;
        double tagihanRekan = rekan.ratePerHari * deadlineKolaborasi;
        double totalTagihan = tagihanSaya + tagihanRekan;

        System.out.println("Kolaborasi   : " + this.nama + " & " + rekan.nama);
        System.out.println("Proyek       : " + this.proyek.getNamaProyek());
        System.out.println("Deadline     : " + this.proyek.getDeadlineHari() + " hari → selesai dalam "
                + deadlineKolaborasi + " hari");
        System.out.println("Total tagihan: Rp" + (long) totalTagihan);

        if (this.klien.getBudget() >= totalTagihan) {
            System.out.println("Status       : Deal!");
            System.out.println("  " + this.nama + " dapat: Rp" + (long) tagihanSaya);
            System.out.println("  " + rekan.nama + " dapat: Rp" + (long) tagihanRekan);
        } else {
            System.out.println("Status       : Budget " + this.klien.getNamaKlien() + " tidak cukup.");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getRatePerHari() {
        return ratePerHari;
    }

}
