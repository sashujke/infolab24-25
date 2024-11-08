/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giocatore.testfigura;

/**
 *
 * @author Studente
 */
public class Quadrato extends Figura {
    private double lato;

    
    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public double perimetro() {
        return 4 * lato;
    }

    @Override
    public double area() {
        return lato * lato;
    }
}
