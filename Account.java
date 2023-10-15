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
        System.out.println("Money deposited, but you're still broke"); //Add custom messages from message class
        }
        else {
            this.cashBalance = 0;
            
            System.out.println("You're broke and couldn't pay your bills"); //Add custom messages from message class
        }
    }
}
//Test to see i program is behaving as wanted
/*    public static void main(String[] args) {
    Account t1 = new Account(13);
        //setCashBalance(100);
    t1.setCashBalance(-1100);
    int hej = t1.getCashBalance();
    System.out.println(hej);
    }
}*/