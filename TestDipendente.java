/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testsmartphone.testdipendente;

/**
 *
 * @author jsick
 */
public class TestDipendente {
    public static void main(String[] args) {
        // Creazione degli oggetti di diverse categorie
        Docente docente = new Docente("Stocco Ricardo", "Femmina", "19/99/2099", 20, 10000.0);
        Impiegato impiegato = new Impiegato("Andrea Zaniboni", "Femmina", "15/09/1989", 2, 100.0);
        ImpiegatoStraordinari impiegatoStraordinari = new ImpiegatoStraordinari(
                "Sasha Siarou", "Maschio", "19/04/2006", 4, 1231, 32, 1654);

        // Stampa delle informazioni di ciascun dipendente
        System.out.println(docente.toString());
        System.out.println(impiegato.toString());
        System.out.println(impiegatoStraordinari.toString());

        // Accesso ai singoli attributi tramite i metodi getter
        System.out.println("Ore di docenza del docente  " + docente.getOreDocenza());
        System.out.println("Livello del impiegato " + impiegato.getLivello());
        System.out.println("Stipendio totale dell'impiegato con straordinari " + impiegatoStraordinari.getStipendioMensile());
    }
}

