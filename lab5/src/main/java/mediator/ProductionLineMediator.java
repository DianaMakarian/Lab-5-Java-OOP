package mediator;

import java.util.ArrayList;

import components.Conveyor;
import components.Robot;
import components.Sensor;

public class ProductionLineMediator {
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
        setConveyor(conveyor);
    }

    public Conveyor getConveyor() {
        return conveyor;
    }

    public void setConveyor(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    public void registerSensor(Sensor sensor) {
        setSensor(sensor);
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
