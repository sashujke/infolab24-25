/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author De Lellis Davide
 */
public class Notebook extends PcPortatile {
    public Notebook(String marca, String modello, int ram, int memoriaMassa, String sistemaOperativo, double peso, double altezza, double larghezza, double profondita, double dimensioneVideo) {
        super(marca, modello, ram, memoriaMassa, sistemaOperativo, peso, altezza, larghezza, profondita, dimensioneVideo);
    }

    @Override
    public String toString() {
        return super.toString() + " (Notebook)";
    }
}