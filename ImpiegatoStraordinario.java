/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siarou
 */
public class ImpiegatoStraordinario extends Impiegato {
    private int oreStraordinario;
    private double retribuzioneOrariaStraordinario;

    public ImpiegatoStraordinario(){}
    public ImpiegatoStraordinario(String nominativo, String genere, Data dataNascita, double stipendioMensile, String livello,
        int oreStraordinario, double retribuzioneOrariaStraordinario) 
    {
        super(nominativo, genere, dataNascita, stipendioMensile, livello);
        this.oreStraordinario = oreStraordinario;
        this.retribuzioneOrariaStraordinario = retribuzioneOrariaStraordinario;
    }

    public int getOreStraordinario() { return oreStraordinario; }
    public void setOreStraordinario(int oreStraordinario) { this.oreStraordinario = oreStraordinario; }

    public double getRetribuzioneOrariaStraordinario() { return retribuzioneOrariaStraordinario; }
    public void setRetribuzioneOrariaStraordinario(double retribuzioneOrariaStraordinario) { 
        this.retribuzioneOrariaStraordinario = retribuzioneOrariaStraordinario; 
    }

    //stipendio che tiene conto di straordinari
    public double calcolaStipendioConStraordinario() {
        return getStipendioMensile() + (oreStraordinario * retribuzioneOrariaStraordinario);
    }

    @Override
    public String toString() {
         return "Impiegato straordinario: {" +
                "nominativo='" + getNominativo() + '\'' +
                ", genere='" + getGenere() + '\'' +
                ", dataNascita=" + getDataNascita() +
                ", stipendioMensile=" + getStipendioMensile() +
                ", livello='" + getLivello() + '\'' +
                ", oreStraordinario=" + getOreStraordinario() +
                 ", retribuzione oraria straordinario=" + getRetribuzioneOrariaStraordinario() +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ImpiegatoStraordinario i = (ImpiegatoStraordinario) obj; //cast
    // Confronto attributi
    return getNominativo().equals(i.getNominativo()) &&
           getGenere().equals(i.getGenere()) &&
           getDataNascita().equals(i.getDataNascita()) &&
           Double.compare(getStipendioMensile(), i.getStipendioMensile()) == 0 &&
           getLivello().equals(i.getLivello()) &&
           oreStraordinario == i.getOreStraordinario() &&
           retribuzioneOrariaStraordinario == i. getRetribuzioneOrariaStraordinario();
    }
}