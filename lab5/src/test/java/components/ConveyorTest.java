package components;

import junit.framework.TestCase;
import org.junit.Test;

public class ConveyorTest extends TestCase {

    @Test
    public void testMoveConveyor(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        conveyor.moveConveyor();

        assertEquals("Conveyor is moving", conveyor.getPosition(), "Conveyor should be moving");
    }

    @Test
    public void testGetConveyorPosition(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        assertFalse("Conveyor position should be 0", conveyor.getPosition());
    }

    @Test
    public void testStopConveyor(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        conveyor.stopConveyor();

        assertEquals("Conveyor stoped", conveyor.getPosition(), "Conveyor should be stopped");

    }
}