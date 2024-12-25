package mediator;

import components.Robot;
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

        assertNotNull(mediator.getSensors());
    }


}
