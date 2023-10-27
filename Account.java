class Account {
    private int id;
    private int cashBalance;
    Message[][] messages = Message.createMessageArray();

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
        messages[1][2].printDescription();
        }
        else {
            this.cashBalance = 0;
            
            messages[1][3].printDescription();
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