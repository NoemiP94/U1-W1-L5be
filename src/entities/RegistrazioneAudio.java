package entities;

public class RegistrazioneAudio extends ElementoMultimediale{
    //ATTRIBUTI
    private int volume;

    //COSTRUTTORE
    public RegistrazioneAudio(String titolo, int durata, int volume){
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    //METODI

    public int alzaVolume(){
        //aumento il volume se il volume è >= a 1 e < 5
        if(volume >= 1 && volume < 5){
            volume++;
            String esclamativo = "!".repeat(Math.max(0, volume));
            System.out.println(esclamativo);
        }
        return volume;
    }

    public int abbassaVolume(){
        //abbasso il volume se il volume è <= 5 e > 1
        if(volume <= 5 && volume > 1){
            volume--;
            String esclamativo = "!".repeat(Math.max(0, volume));
            System.out.println(esclamativo);
        }
        return volume;
    }
}
