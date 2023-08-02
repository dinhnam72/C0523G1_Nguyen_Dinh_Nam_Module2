package case_study.model.furama;

public class Room extends Facility{
    private String freeService;
    public Room(){

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, double area, int costs, int maxPeople, String rentalType, String freeService) {
        super(id, name, area, costs, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}
