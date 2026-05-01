package soal1;
public class Main {
    public static void main(String[] args) {

        DompetDigital dompet = new DompetDigital("USR-001", "123456");
        System.out.println();

        System.out.println("=== INFO AKUN ===");
        System.out.println("ID Nasabah : " + dompet.getIdNasabah());
        System.out.println("Status     : " + dompet.getStatusAkun());
        System.out.println("Saldo Awal : Rp" + dompet.getSaldo());
        System.out.println();

        System.out.println("=== UJI SETTER: PIN LAMA SALAH ===");
        dompet.updatePin("000000", "654321");
        System.out.println();

        System.out.println("=== UJI SETTER: PIN BENAR ===");
        dompet.updatePin("123456", "654321");
        System.out.println();

        System.out.println("=== SETOR TUNAI VALID ===");
        dompet.setorTunai(500000);
        System.out.println();

        System.out.println("=== SETOR TUNAI NEGATIF ===");
        dompet.setorTunai(-100000);
        System.out.println();

        System.out.println("=== TARIK TUNAI PIN SALAH ===");
        dompet.tarikTunai(100000, "123456");
        System.out.println();

        System.out.println("=== TARIK TUNAI PIN BENAR ===");
        dompet.tarikTunai(100000, "654321");
        System.out.println();

        System.out.println("=== SALDO AKHIR ===");
        System.out.println("Saldo : Rp" + dompet.getSaldo());
    }
}
