package components;

import mediator.ProductionLineMediator;

public class Robot {
    private String name;
    private ProductionLineMediator mediator;

    public Robot(String name, ProductionLineMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
