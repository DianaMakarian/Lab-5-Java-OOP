package components;

import org.junit.Test;

import static org.junit.Assert.*;

public class SensorTest {
    @Test
    public void testIsSensorTriggered() {
        Sensor sensor = new Sensor("Sensor1", null);

        sensor.triggerSensorNotify();

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
        sensor.triggerSensorNotify();

        sensor.resetSensor();

        assertFalse("Sensor should not be triggered", sensor.isTriggered());
    }

    @Test
    public void testSensorStatus() {
        Sensor sensor = new Sensor("Sensor1", null);

        String notify = sensor.triggerSensorNotify();

        assertEquals("Sensor should be triggered", notify, "Sensor Sensor1 detected a new item");
    }
}