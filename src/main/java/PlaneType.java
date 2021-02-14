public enum PlaneType {
    MARSROVER("Mars Rover",2, 2),
    APOLLO13("Apollo 13", 1, 2);

    private final String model;
    private final int passengerCapacity;
    private final int baggageCapacity;

    PlaneType(String model, int passengerCapacity, int baggageCapacity){
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.baggageCapacity = baggageCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }
}
