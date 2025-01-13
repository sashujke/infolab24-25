/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIAROU ALIAKSANDR 4 I
 */
public class PortoTuristico {
    private PostoBarca[] posti;

    public PortoTuristico(int numeroPosti) {
        posti = new PostoBarca[numeroPosti];
        for (int i = 0; i < numeroPosti; i++) {
            posti[i] = new PostoBarca(i + 1);
        }
    }

    public void assegnaPosto(Barca barca) throws Exception {
        for (PostoBarca posto : posti) {
            if (posto.isLibero()) {
                if (barca.getTipo().equals("VELA") && posto.getNumero() <= 50) {
                    continue;
                }
                posto.occupa(barca);
                System.out.println("Assegnato posto numero: " + posto.getNumero());
                return;
            }
        }
        throw new Exception("Non ci sono posti disponibili per questa barca!");
    }

    public double liberaPosto(int numeroPosto, int giorni) throws Exception {
        if (numeroPosto < 1 || numeroPosto > posti.length) {
            throw new Exception("Numero di posto non valido!");
        }
        PostoBarca posto = posti[numeroPosto - 1];
        Barca barca = posto.libera();
        double costo = barca.calcolaCosto(giorni);
        System.out.println("Posto liberato. Costo totale: " + costo);
        return costo;
    }

    public String[] cercaBarchePerNazionalita(String nazionalita) {
       
        int count = 0;
        for (PostoBarca posto : posti) {
            if (!posto.isLibero() && posto.getBarca().getNazionalita().equals(nazionalita)) {
                count++;
            }
        }
        String[] nomi = new String[count];
        int index = 0;
        for (PostoBarca posto : posti) {
            if (!posto.isLibero() && posto.getBarca().getNazionalita().equals(nazionalita)) {
                nomi[index++] = posto.getBarca().getNome();
            }
        }

        return nomi;
    }
}
