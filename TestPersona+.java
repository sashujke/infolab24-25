/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testpersona.testpersona;

/**
 *
 * @author SIAROU
 */
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
        
        //Persona p2 = new Persona("Scorza", "RealMadrid", new Data(07, 07, 1777));
        //System.out.println(p2.toString());
        
        
    
        Studente studente1 = new Studente ("Sasha", "Siarou", new Data(19, 04, 2006), "4i", "INF", 7.5, "57824");
        System.out.println (studente1.toString());
    }
}
