package components;

import mediator.ProductionLineMediator;

abstract class Component {
    protected ProductionLineMediator mediator;
    protected String name;

    public Component(ProductionLineMediator mediator) {
        this.mediator = mediator;
    }

    public abstract String getName();
}