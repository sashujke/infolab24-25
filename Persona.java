/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studente
 */
public class Persona {
    private String nome;
    private String cognome;
    private Data dataNascita;
    
    public Persona() {
        this.dataNascita = new Data (19,4,2006);
    };
    
    public Persona (String nome, String cognome, Data dataNascita ){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        
    }
    
    // getters && setters ...
    
    public int calcolaEta(Data dataOggi){
        int eta = dataOggi.getAnno() - dataNascita.getAnno();
        
        if (dataOggi.getMese() < dataNascita.getMese()) {
            eta--;
        } else if (dataOggi.getMese() == dataNascita.getMese()) {
                if (dataOggi.getMese() < dataNascita.getGiorno()) {
                    eta--;
                }
        } else {
           
        }
        
        
        return eta;
    }
    
    @Override
    public String toString() {
        return nome + " " + cognome + " " + dataNascita.toString();
    }
}
