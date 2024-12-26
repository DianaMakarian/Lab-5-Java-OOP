package components;

import junit.framework.TestCase;
import org.junit.Test;

public class ConveyorTest extends TestCase {

    @Test
    public void testMoveConveyor(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        conveyor.moveConveyor();
        String action = conveyor.conveyorPerformAction();

        assertEquals("Conveyor should be moving", action, "Conveyor is moving");
    }

    @Test
    public void testGetConveyorPosition(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        String action = conveyor.conveyorPerformAction();

        assertEquals("Conveyor should not be moving", action, "Conveyor is not moving");
    }

    @Test
    public void testStopConveyor(){
        Conveyor conveyor = new Conveyor("Conveyor1", null);

        conveyor.stopConveyor();
        String action = conveyor.conveyorPerformAction();

        assertEquals("Conveyor should not be moving", action, "Conveyor is not moving");
    }
}