/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
* @author SIAROU ALIAKSANDR 4 I
 */
public class Appartamento extends Abitazione {
    private int piano;
    private boolean haAscensore;
    private int numeroTerrazzi;

    public Appartamento(String indirizzo, String citta, int numeroStanze, double superficie,
                        int piano, boolean haAscensore, int numeroTerrazzi) {
        super(indirizzo, citta, numeroStanze, superficie);
        this.piano = piano;
        this.haAscensore = haAscensore;
        this.numeroTerrazzi = numeroTerrazzi;
    }

    public int getPiano() {
        return piano;
    }

    public boolean getHaAscensore() {
        return haAscensore;
    }

    public int getNumeroTerrazzi() {
        return numeroTerrazzi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Piano: " + piano + ", Ascensore: " + (haAscensore ? "Si" : "No") +
               ", Terrazzi: " + numeroTerrazzi;
    }
}

