package components;

import mediator.ProductionLineMediator;
import org.junit.Test;

import static org.junit.Assert.*;

public class SensorTest {
    @Test
    public void whenSensorIsTriggered_thenSensorShouldBeTriggered() {
        Sensor sensor = new Sensor("Sensor1", null);

        sensor.triggerSensor();

        assertTrue("Sensor should be triggered", sensor.isTriggered());
    }

    @Test
    public void whenSensorIsInitialized_thenSensorShouldNotBeTriggered() {
        ProductionLineMediator mediator = new ProductionLineMediator();
        Sensor sensor = new Sensor("Sensor1", mediator);

        assertFalse("Sensor should not be triggered", sensor.isTriggered());
    }

    @Test
    public void whenSensorIsReset_thenSensorShouldNotBeTriggered() {
        Sensor sensor = new Sensor("Sensor1", null);
        sensor.triggerSensor();
        assertTrue("Sensor should be triggered after triggerSensor", sensor.isTriggered());

        sensor.resetSensor();
        assertFalse("Sensor should not be triggered after resetSensor", sensor.isTriggered());
    }
}