/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author De Lellis Davide
 */
public class Desktop extends PcFisso {
    private String tipoSchedaVideo;

    public Desktop(String marca, String modello, int ram, int memoriaMassa, String sistemaOperativo, String tipoContenitore, String tipoSchedaVideo) {
        super(marca, modello, ram, memoriaMassa, sistemaOperativo, tipoContenitore);
        this.tipoSchedaVideo = tipoSchedaVideo;
    }

    public String getTipoSchedaVideo() { return tipoSchedaVideo; }

    @Override
    public String toString() {
        return super.toString() + ", Tipo Scheda Video: " + tipoSchedaVideo;
    }
}
