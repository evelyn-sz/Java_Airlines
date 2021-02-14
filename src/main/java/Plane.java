public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType) {
//        planeType.getModel();
//        planeType.getPassengerCapacity();
//        planeType.getBaggageCapacity();
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
