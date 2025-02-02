/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testbarcasiarou.testbiblioteca;

/**
 *
 * @author jsick
 */
public class TestBiblioteca {

      public static void main(String[] args) {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        Libro libro1 = new Libro("Il Piccolo Principe", "Sasha");
        Libro libro2 = new Libro("La Divina Commedia", "Sasha");

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);

        biblioteca.mostraCatalogo();
 
        Utente utente1 = new Utente("sasha@email.com", "19/04/2006", 2);
  
        utente1.prendiInPrestito(libro1);
        utente1.prendiInPrestito(libro2); 
    
        Libro libro3 = new Libro("213123", "Sasha");
        utente1.prendiInPrestito(libro3);  
        utente1.restituisciLibro(libro1);
        Bibliotecario biblio1 = new Bibliotecario("bibliotecario@email.com", "10/13/1235", "esperto");

       
        biblio1.abilitaUtente(utente1);
        biblio1.disabilitaUtente (utente1);
    }
}
