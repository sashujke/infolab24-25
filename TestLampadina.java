/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lampadina.testlampadina;

/**
 *
 * @author Studente
 */
public class TestLampadina {

	public static void main(String[] args) {
		Lampadina lamp1 = new Lampadina();
		System.out.println (lamp1.getStato());

		Lampadina lamp2 = new Lampadina(true);
		System.out.println (lamp2.getStato());

		lamp1.accendi();
		System.out.println (lamp1.getStato());

		lamp1.spegni();
		System.out.println (lamp1.getStato());

	}
}
