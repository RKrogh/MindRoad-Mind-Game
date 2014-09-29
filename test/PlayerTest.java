import MindRoad.GameRules;
import MindRoad.Player;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class PlayerTest {
    private int nrOfPLayers;
    private int divider;
    private GameRules gr;
    private Player player;

    /*
    Setup class for this test.
     */
    @BeforeMethod
    public void setUp(){
        nrOfPLayers = 35;
        divider = 13;
        gr = new GameRules(nrOfPLayers,divider);
        player = new Player(gr,100,divider);
    }

    /*
    Testing that the correct form of the string is returned.
    */
    @Test
    public void testReturnString() {
        String res = player.play();

        // Den har sortens assert kraver att man har med "-ea" som argument till JVM:en, annars misslyckas ALDRIG
        // testerna. Nagon av oss ska komma ihag att ta med det i presentationen! :)
        assert "Player 100: 1".equals(res) : "Expected correct return string, got " + res;

        // For att den har assertmetoden (och manga andra som assertNotNull, assertSame...) ska funka maste man
        // gora import static org.testng.AssertJUnit.*; Den ar annars smidigare, eftersom den automatiskt skriver ut
        // expected och actual. Och for att man slipper sitta och undra varfor testerna aldrig misslyckas nar man
        // har glomt "-ea"...
        assertEquals("Player 100: 1", res);
    }
}
