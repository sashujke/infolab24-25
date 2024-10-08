public class Frazione {
    
    private int numeratore;
    
    private int denominatore;    


 public Frazione(){};
 public Frazione (int numeratore, int denominatore) {
      this.numeratore = numeratore;
      this.denominatore = denominatore;
     }
     
     

 
 public void setFrazione (int n, int d) {
     if (n != 0 && d != 0) {
         this.denominatore = d;
         this.numeratore = n;
     } else System.out.println("denominatore > 0, numeratore > 0 ");
     
     
     
 }
 public void setDenominatore (int d) {
     this.denominatore = d;
     System.out.println("Numeratore: ");
 }
 
 public String semplificazione (int n, int d) {
     if (n != 0 && d != 0) {
         this.denominatore = d;
         this.numeratore = n;
         if (n < d && n % n == 1) {
             n = n/n;
             d = d/n;
         } else if (d > n && d % 2 == 0 && n % 2 == 0) {
             n=n/2;
             d=d/2;
         } else if ()
         System.out.println ("num = " + n);
         System.out.println ("dom = " + d);
     } else {
         System.out.println ("errors bro ");
     }
     return d + "/" + n;
 } 

 
 @Override
 public String toString() {
     return this.numeratore + " / " + this.denominatore; 
 }
 }
  
