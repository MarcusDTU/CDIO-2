class WinCondition {
    public static boolean getWinCon(Player player) {
        int balance = player.getPlayerAccountBalance();
        if (balance >= 3000) {
            return true;
        } else {
            return false;
        }
    }
}