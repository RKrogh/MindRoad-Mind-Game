import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameRulesTest {
    private int nrOfPLayers;
    private int divider;
    private GameRules gr;

    /*
    Setup class for this test.
     */
    @BeforeMethod
    public void setUp(){
        nrOfPLayers = 35;
        divider = 13;
        gr = new GameRules(nrOfPLayers,divider);
    }

    /*
    The current number must be a positive one to make the game work.
     */
    @Test
    public void testCurrentNumber(){
        assert (gr.getCurrentNumber()>0);
    }

    /*
    The increaseNumber method is used to
     */
    @Test
    public void testIncreaseCurrentNumber() {
        int cn = gr.getCurrentNumber();
        gr.increaseCurrentNumber();
        assert(gr.getCurrentNumber()==cn+1);
    }
}