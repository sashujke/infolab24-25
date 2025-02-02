/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbarcasiarou.testbiblioteca;

/**
 *
 * @author jsick
 */
import java.util.ArrayList;
import java.util.List;
class Bibliotecario extends Account {
    String livelloDiEsperienza; // neoassunto, normale, esperto

    Bibliotecario(String indirizzoEmail, String dataNascita, String livelloDiEsperienza) {
        super(indirizzoEmail, dataNascita);
        this.livelloDiEsperienza = livelloDiEsperienza;
    }

    void abilitaUtente(Utente utente) {
        System.out.println("Utente abilitato: " + utente.indirizzoEmail);
    }

    void disabilitaUtente(Utente utente) {
        System.out.println("Utente disabilitato: " + utente.indirizzoEmail);
    }
}

