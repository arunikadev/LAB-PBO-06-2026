public class MainSoal2 {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp("Philips", 10);
        SmartCCTV cctv = new SmartCCTV("Xiaomi", 20);
        SmartSpeaker speaker = new SmartSpeaker("Google", 15);

        lamp.cekFungsi();
        lamp.prosesPerintah("NYALA");
        lamp.infoPower();

        System.out.println();

        cctv.cekFungsi();
        cctv.hubungkanWiFi();
        cctv.infoPower();

        System.out.println();

        speaker.cekFungsi();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Play Music");
        speaker.infoPower();
    }
}