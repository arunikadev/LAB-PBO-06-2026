public class Main {
    public static void main(String[] args) {
        SmartLamp lamp = new SmartLamp("Philips", 10);
        SmartCCTV cctv = new SmartCCTV("Hikvision", 15);
        SmartSpeaker speaker = new SmartSpeaker("JBL", 20);

        System.out.println("=== SmartLamp ===");
        lamp.cekFungsi();
        lamp.infoPower();
        lamp.prosesPerintah("NYALA");

        System.out.println();

        System.out.println("=== SmartCCTV ===");
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println();

        System.out.println("=== SmartSpeaker ===");
        speaker.cekFungsi();
        speaker.infoPower();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("PLAY MUSIC");
    }
}
