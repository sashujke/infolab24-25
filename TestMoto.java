/**
 *
 * @authr
 */
public class TestMoto {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.setModello ("Kawasaki");
        moto1.setMotore ("Diablo");
        moto1.setCavalli (125);
        moto1.setDistanza(2000);
        moto1.setTempoimpiegato(60);
        moto1.velocitaMS();
        moto1.getStato();        
    }
}
