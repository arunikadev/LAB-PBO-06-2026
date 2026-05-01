public class MainSmartHome {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp("Philips", 15);
        SmartCCTV cctv = new SmartCCTV("Xiaomi", 25);
        SmartSpeaker speaker = new SmartSpeaker("Google Nest", 20);

        System.out.println("=== SMART LAMP ===");
        lampu.cekFungsi();
        lampu.infoPower();
        lampu.prosesPerintah("NYALA");

        System.out.println("\n=== SMART CCTV ===");
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println("\n=== SMART SPEAKER ===");
        speaker.cekFungsi();
        speaker.infoPower();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Putar musik favorit");
    }
}