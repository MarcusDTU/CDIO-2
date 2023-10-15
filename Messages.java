class Message {

    private int id;
    private int messageClass;
    private String description;
    private static String language;
    // These are used by createMessageArray to create a bi-dimensional jagged array
    // of Message objects.
    private static int numberOfSystemMessages = 1;
    private static int numberOfGameMessages = 1;
    private static int numberOfRollMessages = 1;
    private static int numberOfFieldMessages = 13;

    // The class constructors takes id and messageClass as input, and populates the
    // description via getTranslatedDescription. It is set to private, as another
    // function will be used to generate a Message array outside the class.
    private Message(int id, int messageClass) {
        this.id = id;
        this.messageClass = messageClass;
        this.description = getTranslatedDescription(language, this.messageClass, this.id);
    }

    // language must be set via setLanguage, before Message objects are created.
    // This is due to the fact that language is used to generate descriptions for
    // Message objects.
    public void setLanguage(String languageInput) {
        language = languageInput;
    }

    // This method is used to create a Message[][], which contains all messages of a
    // given language. The first row contains system messages, the second row
    // contains game messages, the third row contains roll messages, and the fourth
    // row contains field messages.
    public Message[][] createMessageArray() {
        Message[] systemMessages = new Message[numberOfSystemMessages];
        for (int i = 0; i < systemMessages.length; i++) {
            systemMessages[i] = new Message(i, 0);
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

    // This methods populates the description of a Message object, based on
    // language, id and messageClass;
    private static String getTranslatedDescription(String language, int messageClass, int id) {
        String returnDescription = "";
        if (language.equals("english")) {
            // messageClass 0 is for system messages.
            if (messageClass == 0) {
                if (id == 0) {
                    returnDescription = "";
                }
            }
            // messageClass 1 is for game-related messages that do not belong to either roll
            // or die.
            if (messageClass == 1) {
                if (id == 0) {
                    returnDescription = "";
                }
            }
            // messageClass 2 is for roll-related messages.
            if (messageClass == 2) {
                if (id == 0) {
                    returnDescription = "";
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
                    returnDescription = "";
                }
                if (id == 3) {
                    returnDescription = "";
                }
                if (id == 4) {
                    returnDescription = "";
                }
                if (id == 5) {
                    returnDescription = "";
                }
                if (id == 6) {
                    returnDescription = "";
                }
                if (id == 7) {
                    returnDescription = "";
                }
                if (id == 8) {
                    returnDescription = "";
                }
                if (id == 9) {
                    returnDescription = "";
                }
                if (id == 10) {
                    returnDescription = "";
                }
                if (id == 11) {
                    returnDescription = "";
                }
                if (id == 12) {
                    returnDescription = "";
                }
            }
        }
        return returnDescription;
    }

    public void printDescription() {
        System.out.println(this.description);
    }
}