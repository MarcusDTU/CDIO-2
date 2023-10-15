import java.util.Random;

public class Die {
    private int numberOfRolls;
    private int numberOfSides;
    private Random random;
    public Die (int numberOfRolls, int numberOfSides){
        this.numberOfRolls =numberOfRolls;
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }
    public int[] rollDie(){
        int[] rolls = new int[numberOfRolls+1];
        for (int i = 0; i < this.numberOfRolls; i++){
            rolls[i] = random.nextInt(numberOfSides)+1;
        }

        /*This for loop sums  the dice value in the last element */
        
        for(int i = 1; i < this.numberOfRolls; i++){ 
            rolls[numberOfRolls+1] = rolls[numberOfRolls+1]+rolls[i];
        }
        return rolls;
    }
    

       
    }
