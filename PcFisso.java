/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author De Lellis Davide
 */
public class PcFisso extends Computer {
    private String tipoContenitore;

    public PcFisso(String marca, String modello, int ram, int memoriaMassa, String sistemaOperativo, String tipoContenitore) {
        super(marca, modello, ram, memoriaMassa, sistemaOperativo);
        this.tipoContenitore = tipoContenitore;
    }

    public String getTipoContenitore() { return tipoContenitore; }

    @Override
    public String toString() {
        return super.toString() + ", Tipo Contenitore: " + tipoContenitore;
    }
}
