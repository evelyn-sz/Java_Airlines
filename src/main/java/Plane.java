public class Plane {
    private String model;
    private int passengerCapacity;
    private int baggageCapacity;

    public Plane(String model, int passengerCapacity, int baggageCapacity) {
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
