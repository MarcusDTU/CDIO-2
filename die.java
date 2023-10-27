import java.util.Random;

class Die {
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
        for(int i = 0; i < this.numberOfRolls; i++){ 
            rolls[numberOfRolls] = rolls[numberOfRolls]+rolls[i];
        }
        return rolls;
    }

    public static Die createDie() {

        boolean numberOfRollsFound = false;
        boolean numberOfSidesFound = false;

        Message[][] messages = Message.createMessageArray();
        var scanner = new java.util.Scanner(System.in);

        int numberOfRolls = 0;
        int numberOfSides = 0;

        while(!numberOfRollsFound){
            messages[0][0].printDescription(); //How many rolls are wanted for each turn?
            numberOfRolls = scanner.nextInt();

            if(numberOfRolls == 2){
                numberOfRollsFound = true;
            }
            else{
                messages[0][2].printDescription();
            }
        }
        while(!numberOfSidesFound){
            messages[0][1].printDescription(); //How many sides are wanted for each die?
            numberOfSides = scanner.nextInt();

            if(numberOfSides == 6){
                numberOfSidesFound = true;
            }
            else{
                messages[0][3].printDescription();
            }
        }
        
        
        Die die = new Die(numberOfRolls, numberOfSides);

        return die;
    }
    

       
}
