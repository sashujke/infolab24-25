public class TestFrazione {
    public static void main (String[] args) {
        Frazione frazione1 = new Frazione();
        frazione1.setFrazione(4,12);
        frazione1.semplificazione(4,12);
       
        System.out.println(frazione1.toString());
        System.out.println (frazione1.semplificazione(4, 12));
    
         
    }
    
}
