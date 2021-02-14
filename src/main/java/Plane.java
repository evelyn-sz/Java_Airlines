public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType(){
        return planeType;
    }

    public String getModelFromEnum() {
        return planeType.getModel();
    }

    public double getPassengerCapacityFromEnum() {
        return planeType.getPassengerCapacity();
    }

    public double getBaggageCapacityFromEnum() {
        return planeType.getBaggageCapacity();
    }
}
