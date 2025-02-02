/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbarcasiarou.testbiblioteca;

/**
 *
 * @author jsick
 */
import java.util.ArrayList;
import java.util.List;
class SistemaBiblioteca {
    List<Libro> catalogo;
    List<Utente> utenti;
    List<Bibliotecario> bibliotecari;

    SistemaBiblioteca() {
        catalogo = new ArrayList<>();
        utenti = new ArrayList<>();
        bibliotecari = new ArrayList<>();
    }

    void aggiungiLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro aggiunto: " + libro.titolo);
    }

    void mostraCatalogo() {
        System.out.println("Catalogo della biblioteca:");
        for (Libro libro : catalogo) {
            System.out.println("- " + libro.titolo + " di " + libro.autore);
        }
    }
}