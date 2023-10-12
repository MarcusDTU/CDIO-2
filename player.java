class Player {
    private String name;
    public int ID;
    public Account account;

    public Player(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.account = new Account(ID);
    }

    public String getName() {
        return name;
    }
}