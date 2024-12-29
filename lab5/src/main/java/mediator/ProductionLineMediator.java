package mediator;

import components.Conveyor;
import components.ProductionComponent;
import components.Robot;
import components.Sensor;

import java.awt.*;
import java.util.ArrayList;

public class ProductionLineMediator implements Mediator {
    private final ArrayList<Robot> robots = new ArrayList<>();
    private Conveyor conveyor;
    private Sensor sensor;

    public void registerRobot(Robot robot) {
        robots.add(robot);
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }

    public void registerConveyor(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    public Conveyor getConveyor() {
        return conveyor;
    }

    public void registerSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Sensor getSensor() {
        return sensor;
    }

    @Override
    public void notify(ProductionComponent sender, String message) {
        if (sender instanceof Sensor) {
            handleSensorMessage((Sensor) sender, message);
        } else if (sender instanceof Conveyor) {
            handleConveyorMessage((Conveyor) sender, message);
        } else if (sender instanceof Robot) {
            handleRobotMessage((Robot) sender, message);
        }
    }

    private void handleSensorMessage(Sensor sensor, String message) {
        if (message.equals("triggered")) {
            System.out.println("Sensor " + sensor.getName() + " detected an item.");
            conveyor.moveConveyor();
            for (Robot robot : robots) {
                robot.startTask();
            }
        }
    }

    private void handleConveyorMessage(Conveyor conveyor, String message) {
        if (message.equals("started")) {
            System.out.println("Conveyor is moving.");
        } else if (message.equals("stopped")) {
            System.out.println("Conveyor is stopped.");
            for (Robot robot : robots) {
                robot.stopTask();
            }
        }
    }

    private void handleRobotMessage(Robot robot, String message) {
        if (message.equals("taskStarted")) {
            System.out.println("Robot " + robot.getName() + " started the task.");
        } else if (message.equals("taskStopped")) {
            System.out.println("Robot " + robot.getName() + " stopped the task.");
        }
    }
}