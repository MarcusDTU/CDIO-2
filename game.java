class game{
    public static void main(String[] args){

        languageselecter gameLanguageObj = new languageselecter();
        
        //gameLanguageForMsg is the string that has beed saved from the languageSetup method and returns the selected language for later use in messege class
        var gameLanguageForMsg = gameLanguageObj.languageSetup();

        Message messageObj = new Messege();
        
        //sets game language from the gameLanguageForMsg string
       messageObj.setLanguage(gameLanguageForMsg);


       //creating the to players 
       Player Player1 = new Player("test1", 1);
       Player Player2 = new Player("test2", 2);
        
    }
}