import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlayerTest {
    private int nrOfPLayers;
    private int divider;
    private GameRules gr;
    private Player player;

    @BeforeMethod
    public void setUp(){
        nrOfPLayers = 35;
        divider = 13;
        gr = new GameRules(nrOfPLayers,divider);
        player = new Player(gr,100,divider);
    }


    @Test
    public void testReturnString() {
        assert(player.play().equals("Player 100: 1"));
    }

}