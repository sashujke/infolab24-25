/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
* @author SIAROU ALIAKSANDR 4 I
 */
public class Immobile {
    public String indirizzo;
    public String citta;

    public Immobile(String indirizzo, String citta) {
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    @Override
    public String toString() {
        return "Indirizzo: " + indirizzo + ", Citta: " + citta;
    }
}
