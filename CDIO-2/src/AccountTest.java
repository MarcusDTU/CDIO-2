import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

       
        Player Player1 = new Player("Test", 1);
        Message[][] messages = Message.createMessageArray();
    @Test
        
        public void setCashBalanceTest() {
            
            //tester for at cash balance ikke bliver negativ
            Player1.setPlayerCashBalance(-1100);
            assertEquals(0,Player1.getPlayerAccountBalance());
            

            
        }
    @Test  
        
        public void messagesTest(){
            assertEquals("Total sum of dice is: ",messages[2][3].getDesciption());
        }
    @Test
        public void fieldPointTest(){
            int[] pointsExpected = new int[]{0, 250, -100, 100,-20, 180, 0, -70, 60, -80, -50, 650};
            int[] pointsRecieved = new int[12];

            for(int i = 0; i < pointsRecieved.length; i++){
                pointsRecieved[i] = Field.fieldPoint(i+1);
            }
            for(int i = 0; i < pointsExpected.length; i++){
                assertEquals(pointsExpected[i],pointsRecieved[i]);
            }
        }
        

        
}
// test die roll til rigtigt feldt