package components;

import mediator.ProductionLineMediator;

public class Conveyor extends Component {
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

    public String conveyorPerformAction() {
        if (isRunning) {
            return "Conveyor is moving";
        } else {
            return "Conveyor is not moving";
        }
    }
}
