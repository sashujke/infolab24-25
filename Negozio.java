/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
* @author SIAROU ALIAKSANDR 4 I
 */
public class Negozio extends Immobile {
    private int numeroPiani;
    private int postiAuto;
    private boolean haMezziPubblici;

    public Negozio(String indirizzo, String citta, int numeroPiani, int postiAuto, boolean haMezziPubblici) {
        super(indirizzo, citta);
        this.numeroPiani = numeroPiani;
        this.postiAuto = postiAuto;
        this.haMezziPubblici = haMezziPubblici;
    }

    public int getNumeroPiani() {
        return numeroPiani;
    }

    public int getPostiAuto() {
        return postiAuto;
    }

    public boolean getHaMezziPubblici() {
        return haMezziPubblici;
    }

    @Override
    public String toString() {
        return super.toString() + ", Piani: " + numeroPiani + ", Posti auto: " + postiAuto +
               ", Mezzi pubblici: " + (haMezziPubblici ? "Si" : "No");
    }
}

