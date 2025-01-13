/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIAROU ALIAKSANDR 4 I
 */
public class Barca {
    private String nome;
    private String nazionalita;
    private double lunghezza;
    private double stazza;
    private String tipo; // "VELA" o "MOTORE"

    public Barca(String nome, String nazionalita, double lunghezza, double stazza, String tipo) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public String getNazionalita() { return nazionalita; }
    public double getLunghezza() { return lunghezza; }
    public double getStazza() { return stazza; }
    public String getTipo() { return tipo; }

    public double calcolaCosto(int giorni) {
        if (tipo.equals("VELA")) {
            return lunghezza * 10 * giorni;
        } else {
            return stazza * 20 * giorni;
        }
    }

    @Override
    public String toString() {
        return "Barca: " + nome + ", Tipo: " + tipo + ", Lunghezza: " + lunghezza + "m, Stazza: " + stazza + "t";
    }
}
