/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbarcasiarou.testbiblioteca;

/**
 *
 * @author jsick
 */
import java.util.ArrayList;
import java.util.List;
public class DataNascita {
    private int giorno;
    private int mese;
    private int anno;
    
    DataNascita (int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    
    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }
    public int getGiorno() {
        return giorno;
    }
    
    public void setMese (int mese) {
        this.mese = mese;
    }
    
    public int getMese () {
        return mese;
    }
    
    public void setAnno (int anno) {
        this.anno = anno;
    }
     public int getAnno () {
        return anno;
    }
    
    
    
    @Override
    public String toString() {
        return "Giorno" + giorno + "Mese" + mese + "Anno" + anno;
    }
}
