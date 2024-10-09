/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studente
 */
public class Data {
     private int giorno;
     private int mese;
     private int anno;
     
     public Data () {
};
     public Data (int giorno, int mese, int anno) {
         this.giorno = giorno;
         this.mese = mese;
         this.anno = anno;
     }

     
     public int getGiorno() {
         return giorno;
     }
     
     public int getMese() {
     return mese;
             }
     
     public int getAnno() {
     return anno;
     }
     
     @Override 
     public String toString() {
         return giorno + " " + mese + " " + anno;
     }
}
