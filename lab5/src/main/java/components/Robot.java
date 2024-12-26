package components;

import mediator.ProductionLineMediator;

public class Robot {
    private String name;
    private ProductionLineMediator mediator;
    private boolean isPerformingTask = false;

    public Robot(String name, ProductionLineMediator mediator) {
        this.name = name;
        this.mediator = mediator;
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
