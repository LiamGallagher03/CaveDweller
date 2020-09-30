package cavedweller;

/**
 *
 * @author 802189
 */
public class Food {
    //Fields
    private String name;
    private int hpGiven;
    private boolean isPoisonous, eaten;
    
    //constructor
    public Food(String name, int hpGiven, boolean isPoisonous, boolean eaten) {
        this.name = name;
        this.hpGiven = hpGiven;
        this.isPoisonous = isPoisonous;
        this.eaten = false;
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
    
   public boolean isEaten() {
       return eaten;
   }   
}
