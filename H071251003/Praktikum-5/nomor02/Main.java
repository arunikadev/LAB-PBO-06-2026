package nomor02;

public class Main {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker("Harman", 20);
        
        speaker.infoPower();
        speaker.cekFungsi();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Putar lagu jazz"); 
    }
}