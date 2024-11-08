/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package giocatore.testfigura;

/**
 *
 * @author Studente
 */
public class TestFigura {
    public static void main(String[] args) {
        Triangolo t = new Triangolo(3, 4, 5, 4, 3);
        Pitagora tr = new Pitagora(3, 4);
        Rettangolo r = new Rettangolo(5, 7);
        Quadrato q = new Quadrato(4);
        Cerchio c = new Cerchio(3);

        System.out.println("Triangolo: " + t);
        System.out.println("Triangolo Rettangolo: " + tr);
        System.out.println("Rettangolo: " + r);
        System.out.println("Quadrato: " + q);
        System.out.println("Cerchio: " + c);
    }
}
