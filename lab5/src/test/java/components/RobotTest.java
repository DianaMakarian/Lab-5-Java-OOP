package components;

import junit.framework.TestCase;
import mediator.ProductionLineMediator;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest{
    @Test
    public void whenRobotIsRegistered_thenItShouldAppearInRobotsList() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Robot robot = new Robot("Robot1", mediator);

        mediator.registerRobot(robot);

        assertTrue(mediator.getRobots().contains(robot));
    }

    @Test
    public void whenRobotStartsTask_thenItShouldBePerformingTask() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Robot robot = new Robot("Robot1", mediator);

        robot.startTask();

        assertTrue(robot.isPerformingTask());
    }

    @Test
    public void whenRobotStopsTask_thenItShouldNotBePerformingTask() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Robot robot = new Robot("Robot1", mediator);

        robot.startTask();
        robot.stopTask();

        assertFalse(robot.isPerformingTask());
    }

}