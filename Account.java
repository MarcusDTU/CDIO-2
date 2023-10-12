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

/*class Player {
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

class Test {
    public static void main(String[] args) {
        var David = new Player("David", 13);

        System.out.println(David.account.getCashBalance());

    }
}*/