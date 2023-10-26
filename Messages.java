class Message {

    private int id;
    private int messageClass;
    private String description;
    private String idDescription;
    private static String language = "english";
    // These are used by createMessageArray to create a bi-dimensional jagged array
    // of Message objects.
    private static int numberOfSystemMessages = 4;
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
                    returnDescription = "How many rolls are wanted for each turn? (Note: This game only supports two rolls)";
                }
                if (id == 1) {
                    returnDescription = "How many sides are wanted for each die? (Note: This game only supports six sides)";
                }
                if (id == 2){
                    returnDescription = "Number of rolls is not supported";
                }
                if (id == 3){
                    returnDescription = "Number of sides is not supported";
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
                    returnDescription = "Tower: You have found a lone tower surrounded by lava. You decide to investigate the tower, only to stumble upon a sleeping princess. You walk towards her and start shaking her violently. She gets quite mad and commands you to slay the dragon that guards her tower. After you have slayed the dragon, the princess offers you some gold, but the princess is a greedy c*** and only gives you 250 gold. You think to yourself: What a horribly woman.";
                }
                if (id == 3) {
                    returnDescription = "Crater: On your way back home, you get pre-occupied with thinking about how awesome it is to be a noble.  Due to your dangerous lack of awareness of your surroundings, you end up falling into a big crater, where you are trapped. Luckily, a princess is nearby to help you up. After you got up from the pit, the princess demands that you pay her 100 gold for the rescue mission. ";
                }
                if (id == 4) {
                    returnDescription = "Palace gates: You finally got home from your mission, but in the meantime, someone decided to build a wall and gate around your palace. The guards won’t let you in. You demand to be let in, since it is you home. The guards then realize who you are and therefore they must pay a fine of 100 gold. Still not satisfied, you place the guards and their families in the stockades. Being a noble is freaking awesome.";
                }
                if (id == 5) {
                    returnDescription = "Cold desert: You are going on an adventure and find yourself in a desert in the middle of the night. It is a cold and storm full night, and you are about to freeze to death. Luckily, you find a merchant. He sells you a cup of warm chocolate for 20 gold and you survive the night. The chocolate did not even include whipped cream. Bummer.";
                }
                if (id == 6) {
                    returnDescription = "Walled city:  You stumble upon a walled city. When trying to enter the city, the mayor stops you and congratulates you for being visitor number 1,000,000. You receive the grand price of 180 gold.";
                }
                if (id == 7) {
                    returnDescription = "Monastery: You want to get drunk beyond any recognition and you have heard rumors about the monks at the monastery brewing some strong beer. The monks are very generous and don’t want any gold for all the beer you drank.  You end the night sleeping in the mud with a smile on your face. You consider establishing a monastery in your realms for a steady supply of free beer.";
                }
                if (id == 8) {
                    returnDescription = "Black cave: You entered a dark cave. All the sudden you hear a voice behind you. Give me all your gold says the thief. However, you are a master negotiator and end up paying 80 gold plus your underpants to the thief. You really miss your underpants due to the chaffing of your chainmail.";
                }
                if (id == 9) {
                    returnDescription = "Huts in the mountain: While hiking in the mountain, you hear loud music playing. While following the music, you find a hut, where some students from DTU are holding an Après Ski party.  Some mechanical engineering student challenge you to a beer pong tournament. After destroying them, you win 60 gold. 60 gold doesn’t seem as much, but then you remember that the students are poor. You temporarily consider a career as a professional beer pong player.";
                }
                if (id == 10) {
                    returnDescription = "The Werewall:  In Eldoria's Thicket of Shadows stands the Werewall, a living barrier made from spirits of ancient werewolves. Created for protection, it shifts and howls, granting passage only to those with pure intent. You pay the toll of 80 gold. But hey, you can continue your adventure (extra turn).";
                }
                if (id == 11) {
                    returnDescription = "The pit:  In the fighting pit, where blood and gore are a regular sight. Your gladiator is about to fight the reigning champion. You are tipped the judged in your favor and therefore bet 50 gold. But unfortunately, your gladiator slipped and beheaded himself. You lost your 50 gold.";
                }
                if (id == 12) {
                    returnDescription = "Goldmine: After years of living with the pigs in their stables. Eating nothing else but leftovers from the farmer. One night you heard the farmer and his wife talking about a legendary goldmine where there is enough gold for a lifetime. One day a mysteries man comes to the farm and tells you about the goldmine.  It turns out the goldmine is only a few miles away. You decide to go on an adventure and found to goldmine. The story about gold enough for a lifetime turns out to be a lie and there was only gold enough for a couple of years. You collected 650 gold and put them in your pants, which now weight more than you mom.";
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

