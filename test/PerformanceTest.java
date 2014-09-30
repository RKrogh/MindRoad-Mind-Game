import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import static org.testng.AssertJUnit.*;

public class PerformanceTest {
    private ThreadMXBean tmxb;

    @BeforeMethod
    public void setUp(){
        ManagementFactory.getClassLoadingMXBean();
        tmxb = ManagementFactory.getThreadMXBean();
    }

    @Test
    public void testExecutionTime(){
        long startTime = tmxb.getCurrentThreadCpuTime();
        main.start();
        long finnishTime = tmxb.getCurrentThreadCpuTime();
        System.out.println(startTime);
        System.out.println(finnishTime);
        assert (finnishTime-startTime<0.0000005);
    }
}