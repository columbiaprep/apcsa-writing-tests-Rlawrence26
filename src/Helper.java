import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Helper {
    public static int roll20() {
        return ((int) Math.random() * 20) + 1;
    }
    public void test() {
         for (int i = 0; i < 100; i++) {  
            int result = Helper.roll20();
            assertTrue("Result should be between 1 and 20", result >= 1 && result <= 20);
        }
    }


}
