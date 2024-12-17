/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author De Lellis Davide
 */
public class Server extends PcFisso {
    private int numProcessori;
    private boolean raid;

    public Server(String marca, String modello, int ram, int memoriaMassa, String sistemaOperativo, String tipoContenitore, int numProcessori, boolean raid) {
        super(marca, modello, ram, memoriaMassa, sistemaOperativo, tipoContenitore);
        this.numProcessori = numProcessori;
        this.raid = raid;
    }

    public int getNumProcessori() { return numProcessori; }
    public boolean hasRaid() { return raid; }

    @Override
    public String toString() {
        return super.toString() + ", Numero Processori: " + numProcessori + ", RAID: " + (raid ? "Si" : "No");
    }
}

