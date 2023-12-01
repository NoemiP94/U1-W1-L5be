package entities;

public class RegistrazioneAudio extends ElementoMultimediale{
    //ATTRIBUTI
    private int durata;
    private String volume;

    //COSTRUTTORE
    public RegistrazioneAudio(String titolo, int durata){
        this.titolo = titolo;
        this.durata = durata;
        this.volume = "!";
    }

    //METODI
    public void play(){
        //stampa il titolo e la durata
        System.out.println("Stai riproducendo: " + this.titolo + ", durata: " + this.durata + " min");

    }

    public String alzaVolume(){
        //aumento il volume se il volume è >= a 1 e < 5
        if(volume.length() >= 1 && volume.length()<5){
            volume += "!";
            System.out.println(volume);
        }
        return volume;
    }

    public String abbassaVolume(){
        //abbasso il volume se il volume è <= 5 e > 1
        if(volume.length() <= 5 && volume.length() > 1){
            volume = volume.substring(0, volume.length() - 1); //elimina l'ultimo carattere
            System.out.println(volume);
        }
        return volume;
    }
}
