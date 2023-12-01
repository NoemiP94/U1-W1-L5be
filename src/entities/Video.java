package entities;

public class Video extends ElementoMultimediale{
    //ATTRIBUTI
    private int volume;
    private int luminosita;



    //COSTRUTTORE
    public Video(String titolo, int durata){
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    //METODI
    public int alzaVolume(){
            volume++;
            String esclamativo = "!".repeat(Math.max(0, volume));
            System.out.println(esclamativo);
            return volume;
    }

    public int abbassaVolume(){
        //abbasso il volume se è > 0
        if(volume > 0 ){
            volume--;
            String esclamativo = "!".repeat(Math.max(0, volume));
            System.out.println(esclamativo);
        }
        return volume;
    }

    public int alzaLuminosita(){
            luminosita++;
            String asterisco = "*".repeat(Math.max(0, luminosita));
            System.out.println(asterisco);

        return luminosita;
    }

    public int abbassaLuminosita(){
        //abbasso la luminosità se è > 0
        if(luminosita > 0 ){
            luminosita--;
            String asterisco = "*".repeat(Math.max(0, luminosita));
            System.out.println(luminosita);
        }
        return luminosita;
    }
}
