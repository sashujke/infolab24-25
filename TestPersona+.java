/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author DOCENTE
 */
public class TestPersona {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        System.out.println(p1.toString());
        
        Persona p2 = new Persona("Scorza", "RealMadrid", new Data(07, 07, 1777));
        System.out.println(p2.toString());
        
    }
}
