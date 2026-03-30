import java.util.Scanner;

public class soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal: ");
        String input = scanner.nextLine();
        
        if (!input.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
            System.out.println("Format tanggal tidak valid. Gunakan format dd-mm-yy.");

        }
        
        String[] parts = input.split("-");
        int dd = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int yy = Integer.parseInt(parts[2]);
        
        if (mm < 1 || mm > 12) {
            System.out.println("Bulan tidak valid.");
            return;
        }
    
        if (dd < 1 || dd > 31) {
            System.out.println("Tanggal tidak valid.");
            return;
        }
        

        String[] namaBulan = {
            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        
        int yyyy = 2000 + yy;
        
        System.out.println(dd + " " + namaBulan[mm] + " " + yyyy);
        
        scanner.close();
    }
}
