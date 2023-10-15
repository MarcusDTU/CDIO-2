class Message {

    private int id;
    private int messageClass;
    private String description;
    private static String language;

    public void setLanguage(String languageInput) {
        language = languageInput;
    }

    private void getTranslatedDescription(String language, Message message) {
        if (language.equals("english")) {
            // messageClass 0 is for system messages.
            if (this.messageClass == 0) {
                if (this.id == 0) {
                    this.description = "";
                }
            }
            // messageClass 1 is for game-related messages that do not belong to either roll
            // or die.
            if (this.messageClass == 1) {
                if (this.id == 0) {
                    this.description = "";
                }
            }
            // messageClass 2 is for roll-related messages.
            if (this.messageClass == 2) {
                if (this.id == 0) {
                    this.description = "";
                }
            }
            // messageClass 3 is for field-related messages, where the id matches the sum of
            // the roll.
            if (this.messageClass == 3) {
                if (this.id == 0) {
                    this.description = "";
                }
                if (this.id == 1) {
                    this.description = "";
                }
                if (this.id == 2) {
                    this.description = "";
                }
                if (this.id == 3) {
                    this.description = "";
                }
                if (this.id == 4) {
                    this.description = "";
                }
                if (this.id == 5) {
                    this.description = "";
                }
                if (this.id == 6) {
                    this.description = "";
                }
                if (this.id == 7) {
                    this.description = "";
                }
                if (this.id == 8) {
                    this.description = "";
                }
                if (this.id == 9) {
                    this.description = "";
                }
                if (this.id == 10) {
                    this.description = "";
                }
                if (this.id == 11) {
                    this.description = "";
                }
                if (this.id == 12) {
                    this.description = "";
                }
            }
        }
    }
}