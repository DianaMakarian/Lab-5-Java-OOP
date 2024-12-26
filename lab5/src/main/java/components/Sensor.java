package components;

import mediator.ProductionLineMediator;

public class Sensor  extends Component {
    private String name;
    private ProductionLineMediator mediator;

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
}
