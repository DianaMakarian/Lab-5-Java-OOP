package components;

import mediator.ProductionLineMediator;

public class Sensor  extends Component {
    private String name;
    private ProductionLineMediator mediator;
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

    public ProductionLineMediator getMediator() {
        return mediator;
    }

    public String triggerSensor() {
        isTriggered = true;
        return "Sensor " + getName() + " detected a new item";
    }

    public boolean isTriggered() {
        return isTriggered;
    }

    public void resetSensor() {
        isTriggered = false;
    }
}
