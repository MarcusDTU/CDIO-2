import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class FieldTest {
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
