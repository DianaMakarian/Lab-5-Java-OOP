package components;

import mediator.ProductionLineMediator;

public class Sensor extends ProductionComponent {
    private boolean isTriggered = false;

    public Sensor(String sensor, ProductionLineMediator mediator) {
        super(mediator);
        setName(sensor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTriggered() {
        return isTriggered;
    }

    public void triggerSensor() {
        isTriggered = true;
        if (mediator != null) {
            mediator.notify(this, "triggered");
        }
    }

    public void resetSensor() {
        isTriggered = false;
    }
}