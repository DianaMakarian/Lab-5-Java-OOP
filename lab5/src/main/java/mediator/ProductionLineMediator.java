package mediator;

import java.util.ArrayList;

import components.Conveyor;
import components.Robot;

public class ProductionLineMediator {
    private final ArrayList<Robot> robots = new ArrayList<>();
    private Conveyor conveyor;

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
}
