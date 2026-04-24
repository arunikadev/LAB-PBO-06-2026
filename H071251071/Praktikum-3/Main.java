public class Main {
    public static void main(String[] args) {
        DompetDigital dompet = new DompetDigital("NAS123456", "123456", "Ardi Setiawan");

        System.out.println("=== Informasi Akun Dompet Digital ===");
        System.out.println("Nama Pemilik: " + dompet.getNamaPemilik());
        System.out.println("Saldo Awal: Rp " + dompet.getTampil());
        System.out.println();

        System.out.println("=== Uji Ubah PIN: PIN lama salah ===");
        dompet.changePin("000000", "654321");
        System.out.println();

        System.out.println("=== Uji Ubah PIN: PIN lama benar dan PIN baru valid ===");
        dompet.changePin("123456", "654321");
        System.out.println();

        System.out.println("=== Uji Setor Tunai: nominal valid ===");
        dompet.setorTunai(500000);
        System.out.println();

        System.out.println("=== Uji Setor Tunai: nominal negatif ===");
        dompet.setorTunai(-100000);
        System.out.println();

        System.out.println("=== Uji Tarik Tunai: PIN lama/salah ===");
        dompet.tarikTunai(200000, "123456");
        System.out.println();

        System.out.println("=== Uji Tarik Tunai: PIN baru/benar ===");
        dompet.tarikTunai(200000, "654321");
        System.out.println();

        System.out.println("=== Saldo Akhir ===");
        System.out.println("Saldo Akhir: Rp " + dompet.getTampil());
    }
}