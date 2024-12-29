package facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionLineFacadeTest {
    @Test
    public void whenProductionLineStarts_thenConveyorAndSensorShouldBeActive() {
        ProductionLineFacade facade = new ProductionLineFacade();
        facade.addConveyor("Main Conveyor");
        facade.addSensor("Item Detection Sensor");

        facade.startProductionLine();

        assertTrue(facade.status());
    }

    @Test
    public void whenProductionLineStops_thenItShouldBeStopped() {
        ProductionLineFacade facade = new ProductionLineFacade();
        facade.addConveyor("Main Conveyor");
        facade.addSensor("Item Detection Sensor");


        facade.startProductionLine();
        facade.stopProductionLine();

        assertFalse(facade.status());
    }

    @Test
    public void whenAddingComponents_thenTheyShouldBeRegisteredCorrectly() {
        ProductionLineFacade facade = new ProductionLineFacade();

        facade.addConveyor("Main Conveyor");
        facade.addSensor("Item Detection Sensor");
        facade.addRobot("Welding Robot");

        assertNotNull(facade.status());
    }
}
