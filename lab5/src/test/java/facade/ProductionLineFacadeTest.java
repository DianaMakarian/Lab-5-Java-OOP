package facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductionLineFacadeTest {
    @Test
    public void testStartProductionLine() {
        ProductionLineFacade productionLine = new ProductionLineFacade();

        productionLine.startProductionLine();

        assertTrue("Production line should be running",productionLine.status());
    }

    @Test
    public void testStopProductionLine() {
        ProductionLineFacade productionLine = new ProductionLineFacade();
        productionLine.startProductionLine();

        productionLine.stopProductionLine();

        assertFalse("Production line should be stopped", productionLine.status());
    }


}
