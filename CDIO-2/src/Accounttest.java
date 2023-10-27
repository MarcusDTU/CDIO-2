import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Accounttest {
    Player Player1 = new Player("Test", 1);
    @Test
    public void setPlayerCashBalanceTest(){
        Player1.setPlayerCashBalance(-3000);
        assertEquals(0,Player1.getPlayerAccountBalance());
    }
}
