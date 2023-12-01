import entities.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio traccia1 = new RegistrazioneAudio("Titolo1", 5);
        traccia1.play();
        traccia1.alzaVolume();
        traccia1.alzaVolume();
        traccia1.abbassaVolume();
    }
}