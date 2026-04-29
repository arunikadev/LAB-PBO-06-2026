package nomor1;
public class Main {
    public static void main(String[] args) {

        DompetDigital dompet = new DompetDigital("ID001", 123456);

        System.out.println("ID Nasabah: " + dompet.getIdNasabah());
        System.out.println("Saldo: " + dompet.getSaldo());

        dompet.setUbahPin(111111, 654321);

        dompet.setUbahPin(123456, 654321);

        dompet.setor(100000);

        dompet.setor(-50000);

        dompet.tarik(50000, 123456);

        dompet.tarik(50000, 654321);

        System.out.println("Saldo akhir: " + dompet.getSaldo());
    }
}