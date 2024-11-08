/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giocatore.testfigura;

/**
 *
 * @author Studente
 */
public class Triangolo extends Figura {
    private double lato1;
    private double lato2;
    private double lato3;
    private double base;
    private double altezza;

    public Triangolo(double lato1, double lato2, double lato3, double base, double altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
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
        return lato1 + lato2 + lato3;
    }

    @Override
    public double area() {
        return (base * altezza) / 2;
    }
}
