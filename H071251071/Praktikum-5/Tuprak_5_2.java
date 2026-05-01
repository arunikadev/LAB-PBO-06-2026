import java.util.Scanner;



// Main Class
public class Tuprak_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instansiasi SmartLamp
        System.out.println("=== SmartLamp ===");
        SmartLamp lamp = new SmartLamp("Philips", 15);
        lamp.cekFungsi();
        lamp.infoPower();
        System.out.print("Masukkan perintah suara: ");
        String perintahLamp = scanner.nextLine();
        lamp.prosesPerintah(perintahLamp);
        System.out.println();

        // Instansiasi SmartCCTV
        System.out.println("=== SmartCCTV ===");
        SmartCCTV cctv = new SmartCCTV("Hikvision", 25);
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();
        System.out.println();

        // Instansiasi SmartSpeaker - bisa akses method dari kedua interface dan abstract class
        System.out.println("=== SmartSpeaker ===");
        SmartSpeaker speaker = new SmartSpeaker("JBL", 50);
        speaker.cekFungsi();           // Method dari abstract class
        speaker.infoPower();            // Method dari abstract class
        speaker.hubungkanWiFi();        // Method dari InteraksiInternet
        System.out.print("Masukkan perintah suara: ");
        String perintahSpeaker = scanner.nextLine();
        speaker.prosesPerintah(perintahSpeaker);  // Method dari KontrolSuara

        scanner.close();
    }
}
