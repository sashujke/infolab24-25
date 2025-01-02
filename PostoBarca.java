/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIAROU ALIAKSANDR 4 I
 */
public class PostoBarca {
    private int numero;
    private Barca barca;

    public PostoBarca(int numero) {
        this.numero = numero;
        this.barca = null; 
    }

    public boolean isLibero() {
        return barca == null;
    }

    public void occupa(Barca barca) throws Exception {
        if (!isLibero()) {
            throw new Exception("Il posto è già occupato!");
        }
        this.barca = barca;
    }

    public Barca libera() throws Exception {
        if (isLibero()) {
            throw new Exception("Il posto è già libero!");
        }
        Barca barcaLiberata = this.barca;
        this.barca = null;
        return barcaLiberata;
    }

    public Barca getBarca() {
        return barca;
    }

    public int getNumero() {
        return numero;
    }
}
