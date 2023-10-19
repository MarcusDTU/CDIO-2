class Message {

    private int id;
    private int messageClass;
    private String description;
    private String idDescription;
    private static String language;
    // These are used by createMessageArray to create a bi-dimensional jagged array
    // of Message objects.
    private static int numberOfSystemMessages = 2;
    private static int numberOfGameMessages = 5;
    private static int numberOfRollMessages = 5;
    private static int numberOfFieldMessages = 13;

    // The class constructors takes id and messageClass as input, and populates the
    // description via getTranslatedDescription. It is set to private, as another
    // function will be used to generate a Message array outside the class.
    private Message(int id, int messageClass) {
        this.id = id;
        this.messageClass = messageClass;
        this.description = getTranslatedDescription(language, this.messageClass, this.id);
        this.idDescription = this.createIdDescription();
    }

    // language must be set via setLanguage, before Message objects are created.
    // This is due to the fact that language is used to generate descriptions for
    // Message objects.
    public static void setLanguage(String languageInput) {
        language = languageInput;
    }

    // This method is used to create a Message[][], which contains all messages of a
    // given language. The first row contains system messages, the second row
    // contains game messages, the third row contains roll messages, and the fourth
    // row contains field messages.
    public static Message[][] createMessageArray() {
        Message[] systemMessages = new Message[numberOfSystemMessages];
        for (int i = 0; i < systemMessages.length; i++) {
            systemMessages[i] = new Message(i,0);
        }
        Message[] gameMessages = new Message[numberOfGameMessages];
        for (int i = 0; i < gameMessages.length; i++) {
            gameMessages[i] = new Message(i, 1);
        }
        Message[] rollMessages = new Message[numberOfRollMessages];
        for (int i = 0; i < rollMessages.length; i++) {
            rollMessages[i] = new Message(i, 2);
        }
        Message[] fieldMessages = new Message[numberOfFieldMessages];
        for (int i = 0; i < fieldMessages.length; i++) {
            fieldMessages[i] = new Message(i, 3);
        }
        Message[][] messageArray = new Message[][] { systemMessages, gameMessages, rollMessages, fieldMessages };

        return messageArray;

    }

    // Generates an id description based on messageClass and id of a Message object
    private String createIdDescription() {
        String output = "";
        if (this.messageClass == 0) {
            output = "SYS-";
        }
        if (this.messageClass == 1) {
            output = "GAME-";
        }
        if (this.messageClass == 2) {
            output = "ROLL-";
        }
        if (this.messageClass == 3) {
            output = "FIELD-";
        }
        output = output + Integer.toString(this.id);
        return output;
    }

    // This methods populates the description of a Message object, based on
    // language, id and messageClass;

    private static String getTranslatedDescription(String language, int messageClass, int id) {
        String returnDescription = "";
        if (language.equals("english")) {
            // messageClass 0 is for system messages.
            if (messageClass == 0) {
                if (id == 0) {
                    returnDescription = "How many rolls are wanted for each turn?";
                }
                if (id == 1) {
                    returnDescription = "How many sides are wanted for each die?";
                }
            }
            // messageClass 1 is for game-related messages that do not belong to either roll
            // or die.
            if (messageClass == 1) {
                if (id == 0) {
                    returnDescription = "Players will take turns, rolling two dice to move to a field labeled\r\n" + 
                            "with numbers from 2 to 12. Each field can either increase or decrease the\r\n" + 
                            "player's money. All players start with a 1000 balance, and the winner is the\r\n" + 
                            "first to reach 3000.";
                }
                if (id == 1){
                    returnDescription = "Your updated cash balance is: ";       
                }
                if (id == 2){
                    returnDescription = "Account updated.";       
                }
                if (id == 3){
                    returnDescription = "You're broke and couldn't pay your bills.";       
                }
                if (id == 4) {
                    returnDescription = "won!";
                }
            }
            // messageClass 2 is for roll-related messages.
            if (messageClass == 2) {
                if (id == 0) {
                    returnDescription = "Press enter to roll die.";
                }
                  if (id == 1) {
                    returnDescription = "The value of die one is: ";
                }
                  if (id == 2) {
                    returnDescription = "The value of die two is: ";
                }
                  if (id == 3) {
                    returnDescription = "Total sum of dice is: ";
                }
                if (id == 4) {
                    returnDescription = "'s turn.";
                }
               

            }
            // messageClass 3 is for field-related messages, where the id matches the sum of
            // the roll.
            if (messageClass == 3) {
                if (id == 0) {
                    returnDescription = "";
                }
                if (id == 1) {
                    returnDescription = "";
                }
                if (id == 2) {
                    returnDescription = "2";
                }
                if (id == 3) {
                    returnDescription = "3";
                }
                if (id == 4) {
                    returnDescription = "4";
                }
                if (id == 5) {
                    returnDescription = "5";
                }
                if (id == 6) {
                    returnDescription = "6";
                }
                if (id == 7) {
                    returnDescription = "7";
                }
                if (id == 8) {
                    returnDescription = "8";
                }
                if (id == 9) {
                    returnDescription = "9";
                }
                if (id == 10) {
                    returnDescription = "10";
                }
                if (id == 11) {
                    returnDescription = "11";
                }
                if (id == 12) {
                    returnDescription = "12";
                }
            }
        }
        return returnDescription;
    }

    public void printDescription() {
        System.out.println(this.description);
    }
    public String getDesciption(){
        return this.description;
    }
}
// LIST OF MESSAGES:
// SYSTEM MESSAGES:
// id 0: How many rolls are wanted for each turn?
// id 1: How many sides are wanted for each die?
// id 2:
// ...
// GAME MESSAGES:
// id 0: Players will take turns, rolling two dice to move to a field labeled
// with numbers from 2 to 12. Each field can either increase or decrease the
// player's money. All players start with a 1000 balance, and the winner is the
// first to reach 3000.
// id 1: Your updated cash balance is:(space after ": ")
// id 2:
// ...
// ROLL MESSAGES:
// id 0: Press enter to roll die.
// id 1: The value of die one is:(space after ": ")
// id 2: The value of die two is:(space after ": ")
// id 3: Total sum of dice is:(space after ": ")
// ...
// FIELD MESSAGES:
// id 0:
// id 1:
// id 2:
// ...