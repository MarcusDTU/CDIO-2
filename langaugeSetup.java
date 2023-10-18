import javax.annotation.processing.Messager;
class Languageselecter{
    public static void languageSetup(){
        boolean languageFound = false;
        String gameLanguage = "";       
        //create scanner obj
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        String newline = System.lineSeparator();
        
        
        while(!languageFound){
            System.out.println("Choose language:" + newline + "1 for English" + newline + "2 for Danish");
        
            var language = scanner.nextLine();
        
            //check what language has been choosen
            if(language.equals("1")){
                gameLanguage = "english";
                System.out.println("English has been choosen");
                languageFound = true;
            }
            else{
                System.out.println("Language not supported"+newline);

            }

        
        }
        scanner.close();
        
       Message.setLanguage(gameLanguage);
    
    }
}