package mediator;

import components.ProductionComponent;

public interface Mediator {
    void notify(ProductionComponent sender, String message);
}
