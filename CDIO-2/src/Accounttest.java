import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AccountTest {
    Player player1 = new Player("Test", 1);


    @Test
    public void setPlayerCashBalanceTest(){
        player1.setPlayerCashBalance(-3000);
        assertEquals(0,player1.getPlayerAccountBalance());

        player1.setPlayerCashBalance(1000);
        

        player1.setPlayerCashBalance(0);       
        assertEquals(1000, player1.getPlayerAccountBalance());
    
        player1.setPlayerCashBalance(3000);
        assertEquals(4000, player1.getPlayerAccountBalance());
    
    }




}