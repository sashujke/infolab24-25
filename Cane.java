/**
 *
 * @autho
 */
public class Cane {
    
    private String nome;
    
    private String razza;
    
    private int anni;
    
    public Cane(){};
    
    public Cane(String nome, String razza, int anni){
        this.nome = nome;
        
        this.razza = razza;
        
        this.anni = anni;
    }
    
    public void setNome(String n){
       this.nome = n;
       System.out.println("Il nome del cane e': " + n);
    }
    
    public void setRazza(String r){
        this.razza = r;
        System.out.println("Il cane e' un: " + r);
    }
    
    public void setAnni(int a){
        this.anni = a;
        System.out.println("Il cane ha: " + a + " anni");
    }
    
    public int EtaInAnniUmani(int a){
        int A = (a * 7);
        System.out.println("Gli anni umani del cane sono: " + A);
        return A;
    }   
    
    public String getStato(){
        return nome + " " + razza + " " + anni;
    }
}
