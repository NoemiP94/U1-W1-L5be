package entities;

public class Video extends ElementoMultimediale implements GestioneRiproduzioni, GestioneLuminosita{
    //ATTRIBUTI
    private int volume;
    private int luminosita;



    //COSTRUTTORE
    public Video(String titolo, int durata, int volume, int luminosita){
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    //METODI
    @Override
    public void play(){
        //stampa il titolo e la durata
        for( int i = 1; i <= durata; i++){
            System.out.println(("Stai riproducendo: " + this.titolo + ", volume: " + "!".repeat(Math.max(0, volume))) + ", luminosità: " + "*".repeat(Math.max(0, luminosita))) ;
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
        //abbasso il volume se è > 0
        if(volume > 0 ){
            volume--;
            String esclamativo = "!".repeat(Math.max(0, volume));
            System.out.println("Volume: " + esclamativo);
        }
        return volume;
    }

    @Override
    public int alzaLuminosita(){
            luminosita++;
            String asterisco = "*".repeat(Math.max(0, luminosita));
            System.out.println("Luminosità: " + asterisco);

        return luminosita;
    }

    @Override
    public int abbassaLuminosita(){
        //abbasso la luminosità se è > 0
        if(luminosita > 0 ){
            luminosita--;
            String asterisco = "*".repeat(Math.max(0, luminosita));
            System.out.println("Luminosità: " + asterisco);
        }
        return luminosita;
    }
}
