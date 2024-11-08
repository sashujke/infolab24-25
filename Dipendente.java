/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsmartphone.testdipendente;

/**
 *
 * @author jsick
 */
public class Dipendente {
    private String nominativo;
    private String genere;
    private String dataNascita;
    protected double stipendioMensile;

    public Dipendente(String nominativo, String genere, String dataNascita, double stipendioMensile) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.dataNascita = dataNascita;
        this.stipendioMensile = stipendioMensile;
    }

    public String getNominativo() {
        return nominativo;
    }

    public String getGenere() {
        return genere;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public double getStipendioMensile() {
        return stipendioMensile;
    }

    @Override
    public String toString() {
        return "Dipendente|| nominativo=" + nominativo + ", genere=" + genere +
                ", dataNascita=" + dataNascita + ", stipendioMensile=" + stipendioMensile;
    }
}
