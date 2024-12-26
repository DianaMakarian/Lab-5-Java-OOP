package components;

import mediator.ProductionLineMediator;

public class Conveyor extends Component {
    private String name;
    private ProductionLineMediator mediator;
    private boolean isRunning = false;

    public Conveyor(String conveyor, ProductionLineMediator mediator) {
        super(mediator);
        setName(conveyor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveConveyor() {
        isRunning = true;
    }

    public void stopConveyor() {
        isRunning = false;
    }

    public String isMoving() {
        if (isRunning) {
            return "Conveyor is moving";
        } else {
            return "Conveyor is not moving";
        }
    }
}
