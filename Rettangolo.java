/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giocatore.testfigura;

/**
 *
 * @author Studente
 */
public class Rettangolo extends Figura {
    private double base;
    private double altezza;

    
    public Rettangolo(double base, double altezza) {
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
        return 2 * (base + altezza);
    }

    @Override
    public double area() {
        return base * altezza;
    }
}

