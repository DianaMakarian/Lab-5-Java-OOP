package components;

import junit.framework.TestCase;
import org.junit.Test;

public class ConveyorTest extends TestCase {

    @Test
    public void testMoveConveyor(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        conveyor.moveConveyor();

        assertEquals("Conveyor should be moving", conveyor.isMoving(), "Conveyor is moving");
    }

    @Test
    public void testGetConveyorPosition(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        assertEquals("Conveyor should not be moving", conveyor.isMoving(), "Conveyor is not moving");
    }

    @Test
    public void testStopConveyor(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        conveyor.stopConveyor();

        assertEquals("Conveyor should not be moving", conveyor.isMoving(), "Conveyor is not moving");
    }
}