package case_study.model.furama;

public abstract class  Facility {
    private int id;
    private String name;
    private  double area;
    private int costs;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(int id, String name, double area, int costs, int maxPeople, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.costs = costs;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", costs=" + costs +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}