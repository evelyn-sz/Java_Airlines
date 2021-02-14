public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String getModelFromEnum() {
        return planeType.getModel();
    }

    public int getPassengerCapacityFromEnum() {
        return planeType.getPassengerCapacity();
    }

    public int getBaggageCapacityFromEnum() {
        return planeType.getBaggageCapacity();
    }
}
