/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author De Lellis Davide
 */
public abstract class Computer {
    private String marca;
    private String modello;
    private int ram;
    private int memoriaMassa;
    private String sistemaOperativo;


    public Computer(String marca, String modello, int ram, int memoriaMassa, String sistemaOperativo) {
        this.marca = marca;
        this.modello = modello;
        this.ram = ram;
        this.memoriaMassa = memoriaMassa;
        this.sistemaOperativo = sistemaOperativo;
    }

    // Metodi getter
    public String getMarca() { return marca; }
    public String getModello() { return modello; }
    public int getRam() { return ram; }
    public int getMemoriaMassa() { return memoriaMassa; }
    public String getSistemaOperativo() { return sistemaOperativo; }

    // toString e equals
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modello: " + modello + ", RAM: " + ram + ", Memoria: " + memoriaMassa + ", SO: " + sistemaOperativo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return ram == computer.ram && memoriaMassa == computer.memoriaMassa &&
               marca.equals(computer.marca) && modello.equals(computer.modello) && sistemaOperativo.equals(computer.sistemaOperativo);
    }
}






