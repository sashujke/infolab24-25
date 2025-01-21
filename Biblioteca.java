/**
 * @author stocco
 */

 import java.util.ArrayList;
 import java.util.List;
 
 public class Biblioteca {
     private List<Libro> elencoLibri;
 
     public Biblioteca() {
         elencoLibri = new ArrayList<>();
     }
 
     public void aggiungiLibro(Libro nuovoLibro) {
         elencoLibri.add(nuovoLibro);
     }
 
     public Libro cercaPerTitolo(String titoloRicerca) throws Exception {
         for (Libro libro : elencoLibri) {
             if (libro.getTitolo().equalsIgnoreCase(titoloRicerca)) {
                 return libro;
             }
         }
         throw new Exception("Libro con titolo '" + titoloRicerca + "' non trovato.");
     }
 
     public List<Libro> cercaPerAutore(String autoreRicerca) {
         List<Libro> libriAutore = new ArrayList<>();
         for (Libro libro : elencoLibri) {
             if (libro.getAutore().equalsIgnoreCase(autoreRicerca)) {
                 libriAutore.add(libro);
             }
         }
         return libriAutore;
     }
 
     public int numeroLibri() {
         return elencoLibri.size();
     }
 }
 