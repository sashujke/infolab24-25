/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author SIAROU ALIAKSANDR 4 I
 */
public class TestBarcaSiarou {

    public static void main(String[] args) {
        try {
            PortoTuristico porto = new PortoTuristico(100);

            Barca barca1 = new Barca("asdsad", "it", 12.5, 8, "VELA");
            Barca barca2 = new Barca("fdsgd", "ucr", 8, 10, "MOTORE");
            Barca barca3 = new Barca("asdasd", "it", 15, 12, "VELA");

            porto.assegnaPosto(barca1);
            porto.assegnaPosto(barca2);
            porto.assegnaPosto(barca3);

            porto.liberaPosto(51, 3); 

      
            String[] barcheItaliane = porto.cercaBarchePerNazionalita("Italia");
            System.out.println("Barche italiane sono: ");
            for (String barcheItaliane1 : barcheItaliane) {
                System.out.println("Nome barca: " + barcheItaliane1);
            }
        } catch (Exception e) {
            System.err.println("error404");
        }
    }
}
