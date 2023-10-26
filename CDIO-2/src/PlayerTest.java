import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PlayerTest {
     Player player3 = new Player("Henrik", 10);


    @Test
    public void getNameTest(){
         String player3Name = player3.getName();
        assertEquals("Henrik",player3.getName());
        int player3ID = player3.getId();
        assertEquals(10, player3.getId());

        player3.setPlayerCashBalance(4000);
        int player3Cashbalance = player3.getPlayerAccountBalance();
        assertEquals(5000, player3.getPlayerAccountBalance());



}
    

}