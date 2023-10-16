

class game{
    public static void main(String[] args){

        languageselecter gameLanguageObj = new languageselecter();
        
        //gameLanguageForMsg is the string that has beed saved from the languageSetup method and returns the selected language for later use in messege class
        var gameLanguageForMsg = gameLanguageObj.languageSetup();

        Message[][] messages = new Message[][].createMessageArray();

        //creating the to players 
        Player Player1 = new Player("test1", 1);
        Player Player2 = new Player("test2", 2);
            
        var test = Player1.getAccountBalance();
        System.out.println(test);

        //creating dice
        var die = createDie();

        //Game prints the game info explaning the overall game flow
        System.out.println(messages[1][0]); //Players will take turns, rolling two dice to move to a field labeled with numbers from 2 to 12. Each field can either increase or decrease the player's money. All players start with a 1000 balance, and the winner is the first to reach 3000.
        
        //Game runs in a while loop which checks if a winner has been found. If not the game will continue to ask players to roll dice
        while(!winnerFound()) {
            System.out.println(messages[2][0]); //Press enter to roll die.
            var roll = rollDie();
            System.out.println();
        }
    }
}