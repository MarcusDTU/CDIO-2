class game{
    public static void main(String[] args){

        languageselecter gameLanguage = new languageselecter();
        
        //gameLanguageForMsg is the string that has beed saved from the languageSetup method and returns the selected language for later use in messege class
        var gameLanguageForMsg = gameLanguage.languageSetup();

        Message message = new Messege();
        
        //sets game language from the gameLanguageForMsg string
       message.setLanguage(gameLanguageForMsg);


       //creating the to players 
       Player Player1 = new Player("test1", 1);
       Player Player2 = new Player("test2", 2);
       
        

    }
}