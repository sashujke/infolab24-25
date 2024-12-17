/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author De Lellis Davide
 */
public class PcPortatile extends Computer {
    private double peso;
    private double altezza;
    private double larghezza;
    private double profondita;
    private double dimensioneVideo;

    public PcPortatile(String marca, String modello, int ram, int memoriaMassa, String sistemaOperativo, double peso, double altezza, double larghezza, double profondita, double dimensioneVideo) {
        super(marca, modello, ram, memoriaMassa, sistemaOperativo);
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.dimensioneVideo = dimensioneVideo;
    }

    public double getPeso() { return peso; }
    public double getAltezza() { return altezza; }
    public double getLarghezza() { return larghezza; }
    public double getProfondita() { return profondita; }
    public double getDimensioneVideo() { return dimensioneVideo; }

    @Override
    public String toString() {
        return super.toString() + ", Peso: " + peso + " kg, Altezza: " + altezza + " cm, Larghezza: " + larghezza + ", Profondita: " + profondita + ", Dimensione Video: " + dimensioneVideo + " pollici";
    }
}
