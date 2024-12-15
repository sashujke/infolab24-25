/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testgiocatore.testgiocatorenew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.lang.System.in;

/**
 *
 * @author jsick
 */
public class TestGiocatoreNew {

    public static void main(String[] args) {
        Giocatore giocatore1 = new Giocatore ("Sasha Siarou", true, 8, 11);
        System.out.println (giocatore1.toString());
        System.out.println (giocatore1.calcolaGoalTotali(8,11));
        Giocatore giocatore2 = new Giocatore ();
        giocatore2.setNomeCognome("Siarou Sasha");
        giocatore2.setCapitano(true);
        giocatore2.setGoal (8);
        giocatore2.setGoalNazionale (16);
        System.out.println (giocatore2.toString());
        System.out.println (giocatore2.calcolaGoalTotali(8,16));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Giocatore giocatore3 = new Giocatore();
        try {
                    System.out.print("Inserisci nome e cognome del giocatore: ");
                    giocatore3.setNomeCognome(reader.readLine());
                    System.out.print ("Capitano si o no");
                    giocatore3.setCapitano(Boolean.parseBoolean(reader.readLine()));
                    System.out.print ("Goal quantita");
                    giocatore3.setGoal(Integer.parseInt(reader.readLine()));
                     System.out.print ("GoalNazionale quantita");
                    giocatore3.setGoal(Integer.parseInt(reader.readLine()));
                    System.out.println (giocatore3.toString());
                    System.out.println (giocatore3.calcolaGoalTotali(12,34));
                    }  
        catch (IOException e) {
            System.out.print("Inserisci nome e cognome del giocatore: ");

}

        
    }

  
}
