package space.demo;

import space.SpaceShip;
import space.SpaceShipBuilder;

public class SpaceShipBuilderDemo {

    public static void main(String[] args) {
//        SpaceShip ship = new SpaceShip("sdfasdf", 12312, null, null, null);
        SpaceShip ship = new SpaceShipBuilder()
                .withCargo("Bananas")
                .withCrew(500)
                .withFuel(95.0d)
                .withDestination("Mars")
                .build();

        SpaceShip square = new SpaceShipBuilder().withName("Square").build();
        SpaceShip round = new SpaceShipBuilder().withName("round")
                .withCrew(200)
                .build();

        System.out.println("Look at my spaceship " + ship);
        System.out.println("Look at my spaceship " + square);
        System.out.println("Look at my spaceship " + round);
    }
}
