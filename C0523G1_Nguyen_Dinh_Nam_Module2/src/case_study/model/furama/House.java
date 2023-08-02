package case_study.model.furama;

public class House extends  Facility{
    private String roomStandard;
    private int floor;
    public House(){
    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String id, String name, double area, int costs, int maxPeople, String rentalType, String roomStandard, int floor) {
        super(id, name, area, costs, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
