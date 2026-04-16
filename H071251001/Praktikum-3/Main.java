
public class Main {
    public static void main(String[] args) {
       DompetDigital dompet = new DompetDigital ("USER001", "123456");
       System.out.println("ID Nasabah:" + dompet.getIdNasabah ());

       dompet.setPin ("000000", "654321");
       dompet.setPin ("123456", "654321");

       dompet.setor (50000);
       dompet.setor (-10000);

       dompet.tarik (10000 , "111111");
       dompet.tarik (10000, "654321");

       System.out.println("Saldo Akhir:" + dompet.getSaldo());

    }
}
