/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Siarou
 */
public class TestDipendenteAstratto {
    public static void main(String[] args) {
      
        Data dataNascitaDocente = new Data(15, 3, 1985);
        Docente docente1 = new Docente("Mario Rossi", "Maschio", dataNascitaDocente, 2000.0, "Senior", 20);
        Docente docente2 = new Docente("Mario Rossi", "Maschio", dataNascitaDocente, 2000.0, "Senior", 20);

        Data dataNascitaImpiegatoStraordinario = new Data(20, 7, 1990);
        ImpiegatoStraordinario impiegato1 = new ImpiegatoStraordinario("Anna Verdi", "Femmina", dataNascitaImpiegatoStraordinario, 1800.0, "Junior", 15, 25.0);

        //metodi classe Docente
        System.out.println("Dettagli docente1:");
        System.out.println(docente1.toString());
        System.out.println("Ore di docenza docente1: " + docente1.getOreDocenza());// Invoca un getter

        //setter
        docente1.setOreDocenza(25);
        System.out.println("Ore di docenza aggiornate docente1: " + docente1.getOreDocenza());

        //equals
        System.out.println("docente1 e' uguale a docente2? " + docente1.equals(docente2));

        //ImpiegatoStraordinario
        System.out.println("\nDettagli impiegato straordinario:");
        System.out.println(impiegato1.toString());
        System.out.println("Ore straordinarie impiegato1: " + impiegato1.getOreStraordinario());
        System.out.println("Retribuzione oraria straordinario impiegato1: " + impiegato1.getRetribuzioneOrariaStraordinario());

        //stipendio con straordinari
        double stipendioTotale = impiegato1.calcolaStipendioConStraordinario();
        System.out.println("Stipendio totale con straordinari: " + stipendioTotale);

        // Modifica di un attributo con setter
        impiegato1.setOreStraordinario(20);
        System.out.println("Ore straordinarie aggiornate impiegato1: " + impiegato1.getOreStraordinario());

        //equals
        ImpiegatoStraordinario impiegato2 = new ImpiegatoStraordinario("Anna Verdi", "Femmina", dataNascitaImpiegatoStraordinario, 1800.0, "Junior", 20, 25.0);
        System.out.println("impiegato1 e'uguale a impiegato2? " + impiegato1.equals(impiegato2));
    }
}
