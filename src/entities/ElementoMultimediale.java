package entities;

public abstract class ElementoMultimediale {
    //ATTRIBUTI
    public String titolo;
    public int durata;


    //METODI
    public void play(){
        //stampa il titolo e la durata
        for( int i = 1; i <= durata; i++){
            System.out.println(("Stai riproducendo: " + this.titolo + ", durata: " + this.durata + " min")) ;
        }

    }

}
