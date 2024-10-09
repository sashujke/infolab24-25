/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Studente
 */
public class TestPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println(p1.toString());
        
        Persona p2 = new Persona("Van", "Ben", new Data (19,04,2006));
                System.out.println(p2.toString());

        
    }
}
