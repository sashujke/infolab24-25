/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgiocatore.testgiocatorenew;

/**
 *
 * @author jsick
 */
public class Giocatore {
    private String nomecognome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;
    
    Giocatore () {
        nomecognome = " ";
        capitano = false;
        goal = 0;
        goalNazionale = 0;
    }
  Giocatore(String nomecognome, boolean capitano, int goal, int goalNazionale) {
      this.nomecognome = nomecognome;
      this.capitano = capitano;
      this.goal = goal;
      this.goalNazionale = goalNazionale;
  }
  
    public void setNomeCognome (String nomecognome) {
        this.nomecognome = nomecognome;
}
    public String getNomeCognome() {
        return nomecognome;
    }
    public void setCapitano (boolean capitano) {
        this.capitano = capitano;
    }
    public boolean getCapitano() {
        return capitano;
    }
    public void setGoal (int goal) {
        this.goal = goal;
    }
    public int getGoal () {
        return goal;
    }
    public void setGoalNazionale (int goalNazionale) {
        this.goalNazionale = goalNazionale;
    }
    public int getGoalNazionale () {
        return goalNazionale;
    }
    
    public int calcolaGoalTotali (int goal, int goalNazionale) {
        return goal + goalNazionale;
    }
    
    @Override
    public String toString() {
        return nomecognome + " " + "Capitano: " + capitano + " " + goal + " " + goalNazionale;
    }
}
