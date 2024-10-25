/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersona.testpersona;

/**
 *
 * @author Studente
 */
public class AlunnoElementare extends Studente {
    private String sport;
    private String grembiule;


    public AlunnoElementare (String nome, String cognome, Data dataNascita ,String classe, String indirizzo, double mediaVoti, String IDStudente, String sport, String grembiule) {
     super (nome, cognome, dataNascita, classe, indirizzo, mediaVoti, IDStudente);
     this.sport = sport;
     this.grembiule = grembiule;
} 

    public void setsport (String sport) {
        this.sport = sport;
}

    public void setgrembiule (String grembiule) {
        this.grembiule = grembiule;
}

    public String getsport () {
        return sport;
}

    public String grembiule () {
        return grembiule;
}

    
    @Override
     
    public String toString() {
        return super.toString() + "\nSport: " + sport + 
            "\nGrembiule: " + grembiule;
    }
}
