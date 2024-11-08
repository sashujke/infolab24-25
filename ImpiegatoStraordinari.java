/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsmartphone.testdipendente;

/**
 *
 * @author jsick
 */
public class ImpiegatoStraordinari extends Impiegato {
    private int oreStraordinario;
    private double tariffaStraordinari;

    public ImpiegatoStraordinari(String nominativo, String genere, String dataNascita, int livello,
                                 double stipendioMensile, int oreStraordinario, double tariffaStraordinari) {
        super(nominativo, genere, dataNascita, livello, stipendioMensile);
        this.oreStraordinario = oreStraordinario;
        this.tariffaStraordinari = tariffaStraordinari;
    }

    public int getOreStraordinario() {
        return oreStraordinario;
    }

    public double getTariffaStraordinari() {
        return tariffaStraordinari;
    }

    @Override
    public double getStipendioMensile() {
        return super.getStipendioMensile() + (oreStraordinario * tariffaStraordinari);
    }

    @Override
    public String toString() {
        return "ImpiegatoStraordinari: " + super.toString() + ", oreStraordinario=" + oreStraordinario +
                ", tariffaStraordinari=" + tariffaStraordinari + ", stipendioTotale=" + getStipendioMensile();
    }
}
