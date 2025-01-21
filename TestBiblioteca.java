/**
 * @author stocco
 */

 import java.util.Scanner;
 import java.util.List;
 
 public class GestioneBiblioteca {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Biblioteca catalogo = new Biblioteca();
 
         while (true) {
             System.out.println("\n--- Gestione Catalogo Biblioteca ---");
             System.out.println("1. Inserisci un nuovo libro");
             System.out.println("2. Trova un libro tramite il titolo");
             System.out.println("3. Elenca i libri di un autore specifico");
             System.out.println("4. Visualizza il totale dei libri");
             System.out.println("5. Chiudi il programma");
             System.out.print("Scegli un'opzione: ");
             int scelta = -1;
 
             try {
                 scelta = input.nextInt();
             } catch (Exception ex) {
                 input.nextLine(); // Consuma l'input non valido
                 System.out.println("Errore: per favore inserisci un numero valido.");
                 continue;
             }
 
             input.nextLine(); // Consuma il newline
 
             switch (scelta) {
                 case 1:
                     System.out.print("Titolo del libro: ");
                     String titolo = input.nextLine();
                     System.out.print("Autore del libro: ");
                     String autore = input.nextLine();
                     System.out.print("Anno di pubblicazione: ");
                     int annoPubblicazione = input.nextInt();
                     input.nextLine(); // Consuma il newline
                     System.out.print("Editore del libro: ");
                     String editore = input.nextLine();
 
                     Libro nuovoLibro = new Libro(titolo, autore, annoPubblicazione, editore);
                     catalogo.aggiungiLibro(nuovoLibro);
                     System.out.println("Libro aggiunto al catalogo con successo!");
                     break;
 
                 case 2:
                     System.out.print("Inserisci il titolo del libro da cercare: ");
                     String titoloRicercato = input.nextLine();
                     try {
                         Libro libroTrovato = catalogo.cercaPerTitolo(titoloRicercato);
                         System.out.println("Dettagli del libro trovato: " + libroTrovato);
                     } catch (Exception ex) {
                         System.out.println(ex.getMessage());
                     }
                     break;
 
                 case 3:
                     System.out.print("Inserisci il nome dell'autore per la ricerca: ");
                     String autoreRicercato = input.nextLine();
                     List<Libro> risultatiAutore = catalogo.cercaPerAutore(autoreRicercato);
                     if (risultatiAutore.isEmpty()) {
                         System.out.println("Nessun libro trovato per l'autore: " + autoreRicercato);
                     } else {
                         System.out.println("Libri scritti da " + autoreRicercato + ":");
                         for (Libro libro : risultatiAutore) {
                             System.out.println(libro);
                         }
                     }
                     break;
 
                 case 4:
                     System.out.println("Totale libri nel catalogo: " + catalogo.numeroLibri());
                     break;
 
                 case 5:
                     System.out.println("Chiusura del programma. Grazie per aver usato il sistema di gestione biblioteca!");
                     input.close();
                     return;
 
                 default:
                     System.out.println("Scelta non valida. Riprova selezionando un'opzione dal menu.");
             }
         }
     }
 }
 