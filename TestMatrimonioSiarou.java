/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Studente
 */
public class TestMatrimonioSiarou {

  
    public static void main(String[] args) {
        Villa villa = new Villa("Via Sasha", "Testarossa", 5, 555.5, 5, 555.5, true);
        System.out.println("Villa: " + villa.toString());

        Appartamento appartamento = new Appartamento("Via Sasha", "Testarossa", 4, 124.0, 3, true, 3);
        System.out.println("Appartamento: " + appartamento.toString());

        Negozio negozio = new Negozio("Via Sasha", "Testarossa", 2, 999, true);
        System.out.println("Negozio: " + negozio.toString());
        
        Abitazione abitazione = new Abitazione("Via Sasha", "Testarossa", 4, 100.0);
        System.out.println("Abitazione: " + abitazione.toString());
        
       // abitazione.setNumeroStanze(4);
       // abitazione.getNumeroStanze();
    }
}


