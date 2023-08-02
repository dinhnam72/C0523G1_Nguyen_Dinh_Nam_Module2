package case_study.model.furama;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingArea, int floor) {
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.floor = floor;
    }

    public Villa(String id, String name, double area, int costs, int maxPeople, String rentalType, String roomStandard, double swimmingArea, int floor) {
        super(id, name, area, costs, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(double swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingArea=" + swimmingArea +
                ", floor=" + floor +
                '}';
    }
}
