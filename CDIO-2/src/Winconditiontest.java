import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Winconditiontest {

    Player player1 = new Player("test", 0);

    @Test
    public void WinconTestWinnerNotFound(){
        boolean winnerFound = WinCondition.getWinCon(player1);
        assertEquals(false,winnerFound);
        player1.setPlayerCashBalance(3000);
        winnerFound = WinCondition.getWinCon(player1);
        assertEquals(true,winnerFound);
        

    }
   
}
