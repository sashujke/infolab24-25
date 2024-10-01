/**
 *
 * @author
 */
public class Moto {
    
    private String motore;
    
    private String modello;
    
    private int cavalli;
    
    private int distanza;
    
    private int tempoImpiegato;
    
    public Moto(){};
    
    public Moto(String motore, String modello, int cavalli, int distanza, int tempoImpiegato){
        this.motore = motore;
        
        this.modello = modello;
        
        this.cavalli = cavalli;
        
        this.distanza = distanza;
        
        this.tempoImpiegato = tempoImpiegato;
    }
    
    public void setMotore(String n){
       this.motore = n;
       System.out.println("Il motore e': " + n);
    }
    
    public void setModello (String r){
        this.modello = r;
        System.out.println("Il modello e' un: " + r);
    }
    
    public void setCavalli (int a){
        this.cavalli = a;
        System.out.println("Cavalli " + a);
    }
    
    public void setDistanza (int d) {
        this.distanza = d;
        System.out.println ("Distanza in (metri): " + d);
    }
    
    public void setTempoimpiegato (int t){
        this.tempoImpiegato = t;
        System.out.println ("Tempo impiegato (secondi): " + t);
    }
    
    public void velocitaMS (){
        int A = this.distanza/this.tempoImpiegato;
       
        System.out.println("Velocita massima e : " + A + "m/s");
    }   
    
    public void getStato(){
        System.out.println (motore + " " + modello + " " + cavalli + " " + distanza + " " + tempoImpiegato);
    }
}
