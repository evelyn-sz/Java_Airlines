public enum PlaneType {
    MARSROVER("Mars Rover",2, 2),
    APOLLO13("Apollo 13", 3, 2),
    ROCKET("Rocket", 18, 160);

    private final String model;
    private final double passengerCapacity;
    private final double baggageCapacity;
    private double baggageAllowance;

    PlaneType(String model, double passengerCapacity, double baggageCapacity){
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.baggageCapacity = baggageCapacity;
        this.baggageAllowance = baggageCapacity / passengerCapacity;
    }

    public String getModel() {
        return model;
    }

    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public double getBaggageAllowance(){
        return this.baggageAllowance;

    }
}
