package entities;

public class Immagine extends ElementoMultimediale implements GestioneLuminosita{
    //ATTRIBUTI
    private int luminosita;

    //COSTRUTTORE
    public Immagine(String titolo, int luminosita){
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    //METODI
    public void show(){
        // stampa il titolo e la luminosità
        System.out.println("Questa immagine è: " + this.titolo + ", luminosità: " + "*".repeat(Math.max(0, luminosita)));
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

    @Override
    public String toString() {
        return "Immagine scelta{ titolo:" + titolo + ", luminosità: " + "*".repeat(Math.max(0, luminosita)) + "}";
    }
}
