

class game{
    public static void main(String[] args){

        languageselecter gameLanguageObj = new languageselecter();
        
        //gameLanguageForMsg is the string that has beed saved from the languageSetup method and returns the selected language for later use in messege class
        var gameLanguageForMsg = gameLanguageObj.languageSetup();

        Message[][] messages = new Message[][].createMessageArray();

       //creating the to players 
       Player Player1 = new Player("test1", 1);
       Player Player2 = new Player("test2", 2);
        
       var test = Player1.account.getCashBalance();
       System.out.println(test);

       //creating dice
       var scanner = new java.util.Scanner(System.in);
       System.out.println(messages[0][0]);
       var numberOfRolls = scanner.nextInt();
       System.out.println(messages[0][1]);
       var numberOfSides = scanner.nextInt();
       Die die = new Die(numberOfRolls, numberOfSides);

    }
}