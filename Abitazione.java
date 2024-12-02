/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
* @author SIAROU ALIAKSANDR 4 I
 */
public class Abitazione extends Immobile {
    private int numeroStanze;
    private double superficie;

    public Abitazione(String indirizzo, String citta, int numeroStanze, double superficie) {
        super(indirizzo, citta);
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
    }
    
   
  //  public int setNumeroStanze (int numeroStanze){
    //    this.numeroStanze = numeroStanze;
    // }
    public int getNumeroStanze() {
        return numeroStanze;
    }
    
   
    public double getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stanze: " + numeroStanze + ", Superficie: " + superficie;
    }
}
