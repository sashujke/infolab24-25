/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siarou
 */
    public class Data {
    private int giorno;
    private int mese;
    private int anno;

    public Data(){}
    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public int getGiorno() { return giorno; }
    public void setGiorno(int g){ this.giorno=g;}
    public int getMese() { return mese; }
    public void setMese(int m){ this.mese=m;}
    public int getAnno() { return anno; }
    public void setAnno(int a){ this.anno=a;}

    @Override
    public String toString() {
        return giorno + "/" + mese + "/" + anno;
    }
}
