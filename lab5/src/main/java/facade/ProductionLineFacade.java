package facade;

import components.Conveyor;
import components.Robot;
import components.Sensor;
import mediator.ProductionLineMediator;

public class ProductionLineFacade {
    private final ProductionLineMediator mediator;
    private boolean isRunning = false;

    public ProductionLineFacade() {
        this.mediator = new ProductionLineMediator();
    }

    public void addConveyor(String conveyorName) {
        Conveyor conveyor = new Conveyor(conveyorName, mediator);
        mediator.registerConveyor(conveyor);
        System.out.println("Conveyor '" + conveyorName + "' added to the production line");
    }

    public void addSensor(String sensorName) {
        Sensor sensor = new Sensor(sensorName, mediator);
        mediator.registerSensor(sensor);
        System.out.println("Sensor '" + sensorName + "' added to the production line");
    }

    public void addRobot(String robotName) {
        Robot robot = new Robot(robotName, mediator);
        mediator.registerRobot(robot);
        System.out.println("Robot '" + robotName + "' added to the production line");
    }

    public void startProductionLine() {
        if (!isRunning) {
            System.out.println("Starting the production line...");
            isRunning = true;
            mediator.getConveyor().moveConveyor();
            mediator.getSensor().triggerSensor();
            System.out.println("Production line is now running");
        } else {
            System.out.println("The production line is already running");
        }
    }

    public void stopProductionLine() {
        if (isRunning) {
            System.out.println("Stopping the production line...");
            isRunning = false;
            mediator.getConveyor().stopConveyor();
            System.out.println("Production line has been stopped");
        } else {
            System.out.println("The production line is already stopped");
        }
    }

    public void checkStatus() {
        System.out.print("Status: ");
        if (isRunning) {
            System.out.println("The production line is currently running");
        } else {
            System.out.println("The production line is currently stopped");
        }
    }

    public boolean status() {
        return isRunning;
    }
}