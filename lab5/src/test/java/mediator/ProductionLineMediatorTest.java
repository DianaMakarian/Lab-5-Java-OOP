package mediator;

import components.Conveyor;
import components.Robot;
import components.Sensor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionLineMediatorTest {

    @Test
    public void whenRobotIsRegistered_thenFieldShouldNotBeNull() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Robot robot = new Robot("Robot1", mediator);

        mediator.registerRobot(robot);

        assertNotNull("Robots should not be null",mediator.getRobots());
    }

    @Test
    public void whenConveyorIsRegistered_thenFieldShouldNotBeNull() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);

        mediator.registerConveyor(conveyor);

        assertNotNull(mediator.getConveyor());
    }

    @Test
    public void whenSensorIsRegistered_thenFieldShouldNotBeNull() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Sensor sensor = new Sensor("Sensor1", mediator);

        mediator.registerSensor(sensor);

        assertNotNull(mediator.getSensor());
    }

    @Test
    public void whenConveyorStarts_thenMediatorShouldHandleNotification() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);
        mediator.registerConveyor(conveyor);

        conveyor.moveConveyor();

        assertEquals("Conveyor is moving", conveyor.conveyorPerformAction());
    }

    @Test
    public void whenSensorIsTriggered_thenMediatorShouldNotifyConveyorAndRobots() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);
        Robot robot = new Robot("Robot1", mediator);
        Sensor sensor = new Sensor("Sensor1", mediator);
        mediator.registerConveyor(conveyor);
        mediator.registerRobot(robot);
        mediator.registerSensor(sensor);

        sensor.triggerSensor();

        assertEquals("Conveyor is moving", conveyor.conveyorPerformAction());
        assertTrue(robot.isPerformingTask());
    }

    @Test
    public void whenConveyorStops_thenMediatorShouldStopRobots() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);
        Robot robot = new Robot("Robot1", mediator);
        mediator.registerConveyor(conveyor);
        mediator.registerRobot(robot);

        conveyor.moveConveyor();
        conveyor.stopConveyor();

        assertEquals("Conveyor is not moving", conveyor.conveyorPerformAction());
        assertFalse(robot.isPerformingTask());
    }

}
