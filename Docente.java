/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsmartphone.testdipendente;

/**
 *
 * @author jsick
 */
public class Docente extends Dipendente {
    private int oreDocenza;

    public Docente(String nominativo, String genere, String dataNascita, int oreDocenza, double stipendioMensile) {
        super(nominativo, genere, dataNascita, stipendioMensile);
        this.oreDocenza = oreDocenza;
    }

    public int getOreDocenza() {
        return oreDocenza;
    }

    @Override
    public String toString() {
        return "Docente: " + super.toString() + "|| oreDocenza=" + oreDocenza;
    }
}