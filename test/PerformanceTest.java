import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import MindRoad.main;
import static org.testng.AssertJUnit.*;

public class PerformanceTest {

    @BeforeMethod
    public void setUp(){
    }

    @Test
    public void testExecutionTime(){
        long startTime = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
        main.start();
        long finnishTime = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
        System.out.println(startTime);
        System.out.println(finnishTime);
        assert (finnishTime-startTime<0.0000005);
    }
}