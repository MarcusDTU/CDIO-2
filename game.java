//import java.util.Scanner;

class game{
    public static void main(String[] args){
        boolean winnerFound = false;
        boolean extraTurn = false;
        int playerTurn = 1;
        
        Languageselecter.languageSetup();
        
        //gameLanguageForMsg is the string that has beed saved from the languageSetup method and returns the selected language for later use in messege class
        

        Message[][] messages = Message.createMessageArray();

        //creating the to players 
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        System.out.println("Please enter the name of player 1: ");
        var name1 = scanner.nextLine();
        Player Player1 = new Player(name1, 1);
        System.out.println("Please enter the name of player 2: ");
        var name2 = scanner.nextLine();
        Player Player2 = new Player(name2, 2);
        //scanner.close();

        //creating dice
        var die = Die.createDie();

        //Game prints the game info explaning the overall game flow
        System.out.println(messages[1][0]); //Players will take turns, rolling two dice to move to a field labeled with numbers from 2 to 12. Each field can either increase or decrease the player's money. All players start with a 1000 balance, and the winner is the first to reach 3000.
        
        //Game runs in a while loop which checks if a winner has been found. If not the game will continue to ask players to roll dice
        scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        while(!winnerFound) {
            
            if(playerTurn == 1) {
                System.out.println(messages[2][0]); //Press enter to roll die.
                var roll = scanner.nextLine();
                
                while (!(roll.equals(""))) {
                    System.out.println(messages[2][0]); //Press enter to roll die.
                }

                int[] rolls = die.rollDie();
                System.out.println(messages[2][1] + "" + rolls[0] + System.lineSeparator() + messages[2][2] + "" + rolls[1] + System.lineSeparator() + messages[2][3] + "" + rolls[2]);
                // 2.1 = The value of die one is:, 2.2 = The value of die two is:, 2.3 = Total sum of dice is:

                //Gets the field value and sets  player's cash balance 
                var points = Field.fieldPoint(rolls[2]);
                Player1.setPlayerCashBalance(points);

                //Prints field info and updated player account balance
                System.out.println(messages[3][rolls[2]]);
                var updatedCashBalance = Player1.getPlayerAccountBalance();
                System.out.println(messages[1][1] + "" + updatedCashBalance); //Your updated cash balance is:

                //check if player1 has won
                winnerFound = WinCondition.getWinCon(Player1);
                
                // if the winner has been found it break out of the while loop
                if(winnerFound) {
                    break;
                }
                extraTurn = Field.extraTurn(rolls[2]);
                
                if(extraTurn == false){
                    playerTurn = 2;   
                }
            }
                
            else if(playerTurn == 2) {
                System.out.println(messages[2][0]); //Press enter to roll die.
                var roll = scanner.nextLine();
                
                while (!(roll.equals(""))) {
                    System.out.println(messages[2][0]); //Press enter to roll die.
                }
                
                int [] rolls = die.rollDie();
                System.out.println(messages[2][1] + "" + rolls[0] + System.lineSeparator() + messages[2][2] + "" + rolls[1] + System.lineSeparator() + messages[2][3] + "" + rolls[2]);
                // 2.1 = The value of die one is:, 2.2 = The value of die two is:, 2.3 = Total sum of dice is:

                //Gets the field value and sets  player's cash balance 
                var points = Field.fieldPoint(rolls[2]);
                Player2.setPlayerCashBalance(points);

                //Prints field info and updated player account balance
                System.out.println(messages[3][rolls[2]]);
                var updatedCashBalance = Player2.getPlayerAccountBalance();
                System.out.println(messages[1][1] + "" + updatedCashBalance); //Your updated cash balance is:

                //check if player1 has won
                winnerFound = WinCondition.getWinCon(Player2);
                
                // if the winner has been found it break out of the while loop
                if(winnerFound) {
                    break;
                }
                
                extraTurn = Field.extraTurn(rolls[2]);
                
                if(extraTurn == false){
                    playerTurn = 1;    
                }
            }    
        }
        scanner.close();
    }
}