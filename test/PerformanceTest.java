import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import static org.testng.AssertJUnit.*;

public class PerformanceTest {
    private StartGame game;

    @BeforeMethod
    public void setUp(){
        game = new StartGame();
    }

    @Test
    public void testExecutionTime(){
        long startTime = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
        game.start();
        long finnishTime = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
        System.out.println(startTime);
        System.out.println(finnishTime);
        assert (finnishTime-startTime<0.000005);
    }
}