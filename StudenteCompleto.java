/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersona.testpersona;

/**
 *
 * @author Studente
 */
public class Studente extends Persona {
    private String classe;
    private String indirizzo;
    private double mediaVoti;
    private String IDStudente;
    
    public Studente(String nome, String cognome, Data dataNascita, String classe, String indirizzo, double mediaVoti, String IDStudente){
        super(nome, cognome, dataNascita);
        
        this.classe = classe;
        this.indirizzo = indirizzo;
        this.mediaVoti = mediaVoti;
        this.IDStudente = IDStudente;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setMediaVoti (double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }
    public void setIDStudente (String IDStudente) {
        this.IDStudente = IDStudente;
    }
    public String getClasse () {
         return classe;
    }
     public String getIndirizzo () {
         return indirizzo;
    }
      public double getmediaVoti () {
         return mediaVoti;
    }
       public String getIDStudente () {
         return IDStudente;
    }
     
    
    @Override 
    public String toString() {
        return super.toString() + "classe: " + classe +
                "\nindirizzo: " + indirizzo + 
                "\nmedia: " + mediaVoti +
                "\nIDSTUDENTE: " + IDStudente;
     }
    
}
