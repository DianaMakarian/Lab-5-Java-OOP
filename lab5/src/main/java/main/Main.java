package main;

import facade.ProductionLineFacade;

public class Main {
    public static void main(String[] args) {
        ProductionLineFacade productionLine = new ProductionLineFacade();

        productionLine.addConveyor("Main Conveyor");
        productionLine.addSensor("Item Detection Sensor");
        productionLine.addRobot("Welding Robot");
        productionLine.addRobot("Painting Robot");

        System.out.println("_________________");
        productionLine.startProductionLine();

        productionLine.checkStatus();

        System.out.println("_________________");
        productionLine.stopProductionLine();

        productionLine.checkStatus();
    }
}