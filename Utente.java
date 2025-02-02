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
class Utente extends Account {
    int maxLibriInPrestito;
    List<Libro> libriInPrestito;

    Utente(String indirizzoEmail, String dataNascita, int maxLibriInPrestito) {
        super(indirizzoEmail, dataNascita);
        this.maxLibriInPrestito = maxLibriInPrestito;
        this.libriInPrestito = new ArrayList<>();
    }

    void prendiInPrestito(Libro libro) {
        if (libriInPrestito.size() < maxLibriInPrestito) {
            libriInPrestito.add(libro);
            System.out.println("Hai preso in prestito: " + libro.titolo);
        } else {
            System.out.println("Hai raggiunto il limite massimo di libri.");
        }
    }

    void restituisciLibro(Libro libro) {
        libriInPrestito.remove(libro);
        System.out.println("Hai restituito: " + libro.titolo);
    }
}
