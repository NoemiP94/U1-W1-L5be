import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio traccia1 = new RegistrazioneAudio("Titolo1", 5, 2);
        traccia1.play();
        traccia1.alzaVolume();
        traccia1.alzaVolume();
        traccia1.abbassaVolume();
        System.out.println("------------------------------");
        Video video1 = new Video("Video1", 2,3,4);
        video1.play();
        video1.alzaVolume();
        video1.alzaVolume();
        video1.alzaLuminosita();
        video1.abbassaLuminosita();
        System.out.println("------------------------------");
        Immagine casa = new Immagine("Immagine1", 3);
        casa.show();
        casa.alzaLuminosita();
        casa.abbassaLuminosita();
    }
}