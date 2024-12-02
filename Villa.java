/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIAROU ALIAKSANDR 4 I
 */
public class Villa extends Abitazione {
    private int numeroPiani;
    private double superficieGiardino;
    private boolean haPiscina;

    public Villa(String indirizzo, String citta, int numeroStanze, double superficie, 
                 int numeroPiani, double superficieGiardino, boolean haPiscina) {
        super(indirizzo, citta, numeroStanze, superficie);
        this.numeroPiani = numeroPiani;
        this.superficieGiardino = superficieGiardino;
        this.haPiscina = haPiscina;
    }

    public int getNumeroPiani() {
        return numeroPiani;
    }

    public double getSuperficieGiardino() {
        return superficieGiardino;
    }

    public boolean getHaPiscina() {
        return haPiscina;
    }

    @Override
    public String toString() {
        return super.toString() + ", Piani: " + numeroPiani + ", Giardino: " + superficieGiardino + 
               " m2, Piscina: " + (haPiscina ? "Si" : "No");
    }
}

