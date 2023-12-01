import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ElementoMultimediale[] arrayElementi = new ElementoMultimediale[5]; // creo un'array in cui metterò gli elementi
        Scanner scanner = new Scanner(System.in);

        // ciclo l'array in modo che ad ogni "giro" possa inserire un nuovo elemento
        for (int i = 0; i < arrayElementi.length; i++) {
            System.out.println("Cosa vuoi creare? Scegli tra audio, video o immagine");
            String choose = scanner.nextLine();

            // switch per la scelta del tipo di oggetto
            switch (choose) {
                case "audio":
                    System.out.println("Crea una Registrazione Audio: ");
                    System.out.println("Inserisci un titolo:");
                    String inputTitoloAudio = scanner.nextLine();
                    System.out.println("Imposta una durata:");
                    int inputDurataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Imposta un volume: ");
                    int inputVolumeAudio = Integer.parseInt(scanner.nextLine());
                    // creo audio e lo metto nell'array
                    arrayElementi[i] = new RegistrazioneAudio(inputTitoloAudio, inputDurataAudio, inputVolumeAudio);
                    break;
                case "video":
                    System.out.println("Crea un Video: ");
                    System.out.println("Inserisci un titolo:");
                    String inputTitoloVideo = scanner.nextLine();
                    System.out.println("Imposta una durata:");
                    int inputDurataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Imposta un volume: ");
                    int inputVolumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Imposta una luminosità: ");
                    int inputLuminositaVideo = Integer.parseInt(scanner.nextLine());
                    // creo video e lo metto nell'array
                    arrayElementi[i] = new Video(inputTitoloVideo, inputDurataVideo, inputVolumeVideo, inputLuminositaVideo);
                    break;
                case "immagine":
                    System.out.println("Crea un'Immagine': ");
                    System.out.println("Inserisci un titolo:");
                    String inputTitoloImg = scanner.nextLine();
                    System.out.println("Imposta una luminosità: ");
                    int inputLuminositaImg = Integer.parseInt(scanner.nextLine());
                    // creo immagine e lo metto nell'array
                    arrayElementi[i] = new Immagine(inputTitoloImg, inputLuminositaImg);
                    break;
                default:
                    // se si sbaglia a scrivere l'input rimanda alla scelta iniziale
                    System.out.println("ERRORE! Puoi scegliere tra audio, video e immagine!");
                    i--;
            }
        }

        // ciclo l'array per poter scegliere l'elemento da mostrare
        for (int i = 0; i < arrayElementi.length; i++){
            System.out.println("Quale elemento vuoi vedere? Scegli da 1 a 5 (Premi 0 per uscire)");
            int mostra = Integer.parseInt(scanner.nextLine());
            switch (mostra) {
                case 1:
                    System.out.println(arrayElementi[0]);
                    break;
                case 2:
                    System.out.println(arrayElementi[1]);
                    break;
                case 3:
                    System.out.println(arrayElementi[2]);
                    break;
                case 4:
                    System.out.println(arrayElementi[3]);
                    break;
                case 5:
                    System.out.println(arrayElementi[4]);
                    break;
                case 0:
                    System.exit(0); // uscita dal programma
                default:
                    System.out.println("Inserisci un numero valido per la scelta!");
                    i--;
            }
        }

        scanner.close();
    }
}