package facade;

public class ProductionLineFacade {
    boolean isRunning = false;

    public void startProductionLine() {
        System.out.println("Production line started");
        isRunning = true;
    }

    public void stopProductionLine() {
        System.out.println("Production line stopped");
        isRunning = false;
    }

    public boolean status() {
        return isRunning;
    }
}
