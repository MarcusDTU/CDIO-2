class Account {
    public int id;
    private int cashBalance;
    
    public Account(int id) {
        this.id = id;
        this.cashBalance = 1000;
    }

    public int getCashBalance() {
        return this.cashBalance;
    }

}