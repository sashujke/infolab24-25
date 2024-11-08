/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsmartphone.testdipendente;

/**
 *
 * @author jsick
 */
public class Impiegato extends Dipendente {
    private int livello;

    public Impiegato(String nominativo, String genere, String dataNascita, int livello, double stipendioMensile) {
        super(nominativo, genere, dataNascita, stipendioMensile);
        this.livello = livello;
    }

    public int getLivello() {
        return livello;
    }

    @Override
    public String toString() {
        return "Impiegato" + super.toString() + "||  livello=" + livello;
    }
}
