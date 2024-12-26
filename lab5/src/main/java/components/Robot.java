package components;

import mediator.ProductionLineMediator;

public class Robot extends Component {
    private boolean isPerformingTask = false;

    public Robot(String name, ProductionLineMediator mediator) {
        super(mediator);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startTask() {
        isPerformingTask = true;
    }

    public boolean isPerformingTask() {
        return isPerformingTask;
    }

    public String performTask() {
        return "Robot " + name + "is performing task";
    }

    public void stopTask() {
        isPerformingTask = false;
    }
}
