package components;

import mediator.ProductionLineMediator;

public class Robot {
    private String name;
    private ProductionLineMediator mediator;

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
}
