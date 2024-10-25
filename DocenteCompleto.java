/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersona.testpersona;

/**
 *
 * @author Studente
 */
public class Docente extends Persona {
    private String materia;
    
    
    
public Docente (String nome, String cognome, Data dataNascita, String materia) {
    super(nome, cognome, dataNascita);
    this.materia = materia;
    
    
}

public void setmateria (String materia) {
    this.materia = materia;
}

public String getmateria () {
        return materia;
  }


@Override 
public String toString(){
        return super.toString() + " " + "\nmateria " + materia;
}

}
