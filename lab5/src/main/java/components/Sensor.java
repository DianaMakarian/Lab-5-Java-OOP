package components;

import mediator.ProductionLineMediator;

public class Sensor {
    private String name;
    private ProductionLineMediator mediator;

    public Sensor(String sensor, ProductionLineMediator mediator) {
        this.name = sensor;
        this.mediator = mediator;
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
}
