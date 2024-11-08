/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giocatore.testfigura;

/**
 *
 * @author Studente
 */
public class Cerchio extends Figura {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }
}

