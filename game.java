
class game{
    public static void main(String[] args){
        //create scanner obj
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        String newline = System.lineSeparator();

        System.out.println("Choose language" + newline + "1 for English" + newline + "2 for Danish");
        
        var language = scanner.nextInt();
        if(language == 1){
            String gameLanguage = "english";
        }
        
        scanner.close();
        
       
        

    }
}