package components;

import junit.framework.TestCase;
import org.junit.Test;

public class RobotTest extends TestCase {
    @Test
    public void testStartTask() {
        Robot robot = new Robot("Robot1", null);
        robot.startTask();

        assertTrue("Robot should be performing task", robot.isPerformingTask());
    }

    @Test
    public void testPerformTask() {
        Robot robot = new Robot("Robot1", null);
        String task = robot.performTask();

        assertEquals("Robot1 should performing a task", task, "Robot Robot1is performing task");
    }
    @Test
    public void testStopTask() {
        Robot robot = new Robot("Robot1", null);
        
        robot.stopTask();

        assertFalse("Robot should not be performing task", robot.isPerformingTask());
    }
}