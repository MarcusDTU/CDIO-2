

class game{
    public static void main(String[] args){

        languageselecter gameLanguageObj = new languageselecter();
        
        //gameLanguageForMsg is the string that has beed saved from the languageSetup method and returns the selected language for later use in messege class
        var gameLanguageForMsg = gameLanguageObj.languageSetup();

        

       //creating the to players 
       Player Player1 = new Player("test1", 1);
       Player Player2 = new Player("test2", 2);
        
       var test = Player1.account.getCashBalance();
       System.out.println(test);

       //creating dice
       var scanner = new java.util.Scanner(System.in);
       
       Die Die = new Die(0, 0);

    }
}