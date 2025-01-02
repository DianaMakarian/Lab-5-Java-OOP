package components;

import mediator.ProductionLineMediator;

public abstract class ProductionComponent {
    protected ProductionLineMediator mediator;
    protected String name;

    public ProductionComponent(ProductionLineMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}