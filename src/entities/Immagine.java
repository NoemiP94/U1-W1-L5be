package entities;

public class Immagine extends ElementoMultimediale{
    //ATTRIBUTI
    private int luminosita;

    //COSTRUTTORE
    public Immagine(String titolo, int luminosita){
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    //METODI
    public void show(){
        System.out.println("Questa immagine è: " + this.titolo + ", luminosità: " + "*".repeat(Math.max(0, luminosita)));
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
            System.out.println(asterisco);
        }
        return luminosita;
    }
}
