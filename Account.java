class Account {
    private int id;
    private int cashBalance;
    
    public Account(int id) {
        this.id = id;
        this.cashBalance = 1000;
    }

    public int getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(int money) {
        if (this.cashBalance + money >= 0) {
        this.cashBalance += money;
        }
        else {
            this.cashBalance = 0;
        }
    }
}