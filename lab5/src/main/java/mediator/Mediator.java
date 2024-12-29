package mediator;

import components.*;

public interface Mediator {
    void notify (ProductionComponent sender, String message);
}
