package components;

import junit.framework.TestCase;
import mediator.ProductionLineMediator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConveyorTest {

    @Test
    public void whenConveyorIsRegistered_thenFieldShouldNotBeNull() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);

        mediator.registerConveyor(conveyor);

        assertNotNull(mediator.getConveyor());
    }

    @Test
    public void whenConveyorStarts_thenItShouldBeRunning() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);

        conveyor.moveConveyor();

        assertEquals("Conveyor is moving", conveyor.conveyorPerformAction());
    }

    @Test
    public void whenConveyorStops_thenItShouldNotBeRunning() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Conveyor conveyor = new Conveyor("Conveyor1", mediator);

        conveyor.moveConveyor();
        conveyor.stopConveyor();

        assertEquals("Conveyor is not moving", conveyor.conveyorPerformAction());
    }

}