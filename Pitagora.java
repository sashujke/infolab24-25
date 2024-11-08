/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giocatore.testfigura;

/**
 *
 * @author Studente
 */
public class Pitagora extends Figura {
    private double base;
    private double altezza;

    public Pitagora (double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double perimetro() {
        double ipotenusa = Math.sqrt((base * base) + (altezza * altezza));
        return 1;
    }
}