class Player {
    private String name;
    private int id;
    private Account account;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        this.account = new Account(id);
    }

    public String getName() {
        return name;
    }

    public int getPlayerAccountBalance() {
        return this.account.getCashBalance();
    }

    // Id always matches its associated account id.
    public int getId() {
        return this.id;
    }

    public void setPlayerCashBalance(int money) {
        this.account.setCashBalance(money);
    }
}