T/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testpersona.testpersona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
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

    public static void main(String[] args) throws IOException {
        InputStreamReader Reader = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader (Reader);
        
        
        
        Persona p1 = new Persona();
        System.out.println(p1.toString());
                p1.nome = Tastiera.readLine();
                

        //Persona p2 = new Persona("123", "123", new Data(07, 07, 1777));
        //System.out.println(p2.toString());
        
        
                // Studente ---> Persona
    
        Studente studente1 = new Studente ("\n\n\nSasha", "Siarou", new Data(19, 04, 2006), "4i", "INF", 7.5, "57824");
        System.out.println (studente1.toString());
        
                // AlunnoElementare ---> Studente
                
        AlunnoElementare alunno1 = new AlunnoElementare ("\n\n\nSasha", "Siarou", new Data(19, 04, 2006), " 4i", "INF", 7.5, "57824", "calcio", "no");
        System.out.println (alunno1.toString());
        
                // Docente ---> Persona
        
        Docente docente1 = new Docente ("\n\n\nSasha", "Real", new Data(19, 04, 2006), "Informatica");
        System.out.println (docente1.toString());

    }
}
