package mediator;

import java.util.ArrayList;
import java.util.List;

import components.Robot;

public class ProductionLineMediator {
    private ArrayList<Robot> robots = new ArrayList<>();

    public void registerRobot(Robot robot) {
        robots.add(robot);
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }
}
