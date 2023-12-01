package entities;

public class RegistrazioneAudio extends ElementoMultimediale implements GestioneRiproduzioni{
    //ATTRIBUTI
    private int volume;

    //COSTRUTTORE
    public RegistrazioneAudio(String titolo, int durata, int volume){
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    //METODI
    @Override
    public void play(){
        // stampa il titolo e il volume
        for( int i = 1; i <= durata; i++){
            System.out.println("Stai riproducendo: " + this.titolo + " , volume: " + "!".repeat(Math.max(0, volume)));
        }

    }

    @Override
    public int alzaVolume(){
            volume++;
            String esclamativo = "!".repeat(Math.max(0, volume));
            System.out.println("Volume: " + esclamativo);
        return volume;
    }

    @Override
    public int abbassaVolume(){
            // abbasso il volume se è > 0
            if(volume > 0 ){
                volume--;
                String esclamativo = "!".repeat(Math.max(0, volume));
                System.out.println("Volume: " + esclamativo);
            }
            return volume;
        }

    @Override
    public String toString() {
        return "Immagine scelta { titolo:" + titolo + ", volume: " + "!".repeat(Math.max(0, volume)) + "}";
    }
}
