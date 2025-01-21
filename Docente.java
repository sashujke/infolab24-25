/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siarou
 */
public class Docente extends Impiegato {
    private int oreDocenza;

    public Docente() {}

    public Docente(String nominativo, String genere, Data dataNascita, double stipendioMensile, String livello, int oreDocenza) {
        super(nominativo, genere, dataNascita, stipendioMensile, livello);
        this.oreDocenza = oreDocenza;
    }

    public int getOreDocenza() {
        return oreDocenza;
    }

    public void setOreDocenza(int oreDocenza) {
        this.oreDocenza = oreDocenza;
    }

    @Override
    public String toString() {
        return "Docente: {" +
                "nominativo='" + getNominativo() + '\'' +
                ", genere='" + getGenere() + '\'' +
                ", dataNascita=" + getDataNascita() +
                ", stipendioMensile=" + getStipendioMensile() +
                ", livello='" + getLivello() + '\'' +
                ", oreDocenza=" + oreDocenza +
                '}';
    }
    
@Override
public boolean equals(Object obj) {
    if (this == obj) return true; // Se i riferimenti sono uguali
    if (obj == null || getClass() != obj.getClass()) return false; // Null o classi diverse
    Docente docente = (Docente) obj; //cast
    // Confronto attributi
    return getNominativo().equals(docente.getNominativo()) &&
           getGenere().equals(docente.getGenere()) &&
           getDataNascita().equals(docente.getDataNascita()) &&
           Double.compare(getStipendioMensile(), docente.getStipendioMensile()) == 0 &&
           getLivello().equals(docente.getLivello()) &&
           oreDocenza == docente.getOreDocenza();
    }
}