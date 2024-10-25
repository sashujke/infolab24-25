/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersona.testpersona;

/**
 *
 * @author SIAROU
 */
public class Persona {
    String nome;
    String cognome;
    private Data dataNascita;
    
    public Persona(){
        this.dataNascita = new Data(19, 04, 2006);
    };
    
    public Persona(String nome, String cognome, Data dataNascita){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
    
    // getters & setters ...
    
    public void setnome (String nome) {
        this.nome = "Sasha";
      
    }
     public void setcognome (String cognome) {
        this.cognome = "Siarou";
    }
     
     public String getnome() {
         return nome;
     }
     public String getcognome(){
         return cognome;
     }
    
    
    public int calcolaEta(Data dataOggi){
        int eta = dataOggi.getAnno() - dataNascita.getAnno();
        
        // check compleanno
        if (dataOggi.getMese() < dataNascita.getMese()){
            eta--;
        } else if (dataOggi.getMese() == dataNascita.getMese()){
            if (dataOggi.getGiorno() < dataNascita.getGiorno()){
                eta--;
            }
        } else {
            return eta;
        }
                
        return eta;
    }
    
    @Override
    public String toString(){
        return "nome: " + nome + 
                "\ncognome: " + cognome + 
                "\ndata nascita: " + dataNascita.toString();
    }
    
}
