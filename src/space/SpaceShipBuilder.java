package space;

public class SpaceShipBuilder {
    private String name="Not set";
    private Integer crew= 100;
    private Double fuel= 15.0d;
    private String destination = "Earth";
    private String cargo = "Tomatoes";

    public SpaceShip build(){
        if (crew <= 0)
            throw new IllegalStateException("Too few crew members!!! crew: " + crew);
        return new SpaceShip(name, crew, fuel, destination, cargo);
    }

    public SpaceShipBuilder withName(String name) {
        this.name = name;
        return this;
    }
    public SpaceShipBuilder withCrew(Integer crew) {
        this.crew = crew;
        return this;
    }
    public SpaceShipBuilder withFuel(Double fuel) {
        this.fuel = fuel;
        return this;
    }
    public SpaceShipBuilder withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public SpaceShipBuilder withCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

}
