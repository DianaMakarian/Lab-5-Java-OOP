package components;

import mediator.ProductionLineMediator;

public class Robot extends ProductionComponent {
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
        mediator.notify(this, "taskStarted");
    }

    public void stopTask() {
        isPerformingTask = false;
        mediator.notify(this, "taskStopped");
    }
}