package cavedweller;

/**
 *
 * @author 802189
 */
public class Food {
    //Fields
    private String name;
    private int x, y, hpGiven;
    private boolean isPoisonous;
    public boolean setEaten;
    
    //constructor
    public Food(String name, int x, int y, int hpGiven, boolean isPoisonous, boolean setEaten) {
        this.name = name;
        this.hpGiven = hpGiven;
        this.isPoisonous = isPoisonous;
        this.setEaten = false;
    }
    //methods
    public void speak() {
        if (this.isPoisonous == false) {
        System.out.println("The "+this.name+" was eaten! "+hpGiven+" health points restored!");
        }
    }
    
    public void badSpeak() {
        if (this.isPoisonous == true) {
            System.out.println("The "+this.name+" was terrible! "+-(hpGiven)+" health points were removed!");
        }
    }
    //accessors & setters    
    public String getName() {
        return name;
    }
    
    public int getHpGiven(){
        return hpGiven;
    }
    
    public boolean getIsPoisonous() {
        return isPoisonous;
    }
   public int getX() {
       return y;
   }
   
   public int getY() {
       return x;
   }
}
