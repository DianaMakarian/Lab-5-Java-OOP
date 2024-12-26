package components;

import junit.framework.TestCase;
import org.junit.Test;

public class SensorTest {
    @Test
    public void testIsSensorTriggered() {
        Sensor sensor = new Sensor("Sensor1", null);

        sensor.triggerSensor();

        assertTrue("Sensor should be triggered", sensor.isTriggered());
    }

    @Test
    public void testIsSensorNotTriggered() {
        Sensor sensor = new Sensor("Sensor1", null);

        assertFalse("Sensor should not be triggered", sensor.isTriggered());
    }

    @Test
    public void testResetSensor() {
        Sensor sensor = new Sensor("Sensor1", null);
        sensor.triggerSensor();

        sensor.resetSensor();

        assertFalse("Sensor should not be triggered", sensor.isTriggered());
    }

    @Test
    public void testSensorStatus() {
        Sensor sensor = new Sensor("Sensor1", null);

        String notify =sensor.triggerSensor();

        assertEquals("Sensor should be triggered", notify, "Sensor Sensor1 detected a new item");

}