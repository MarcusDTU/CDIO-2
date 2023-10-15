class Message {

    private int id;
    private int messageClass;
    private String description;
    private static String language;

    private Message(int id, int messageClass) {
        this.id = id;
        this.messageClass = messageClass;
        this.description = getTranslatedDescription(language, this.messageClas, this.id);
    }

    // language must be set via setLanguage, before Message objects are created.
    // This is due to the fact that language is used to generate descriptions for
    // Message objects.
    public void setLanguage(String languageInput) {
        language = languageInput;
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
}