/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siarou
 */
public abstract class Impiegato {
    private String nominativo;
    private String genere;
    private Data dataNascita;
    private double stipendioMensile;
    private String livello;

    public Impiegato(){}
    public Impiegato(String nominativo, String genere, Data dataNascita, double stipendioMensile, String livello) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.dataNascita = dataNascita;
        this.stipendioMensile = stipendioMensile;
        this.livello = livello;
    }

    public String getNominativo() { return nominativo; }
    public void setNominativo(String nominativo) { this.nominativo = nominativo; }

    public String getGenere() { return genere; }
    public void setGenere(String genere) { this.genere = genere; }

    public Data getDataNascita() { return dataNascita; }
    public void setDataNascita(Data dataNascita) { this.dataNascita = dataNascita; }

    public double getStipendioMensile() { return stipendioMensile; }
    public void setStipendioMensile(double stipendioMensile) { this.stipendioMensile = stipendioMensile; }

    public String getLivello() { return livello; }
    public void setLivello(String livello) { this.livello = livello; }

  
    @Override
    public abstract String toString();
    
    @Override
    public abstract boolean equals(Object obj);
}
