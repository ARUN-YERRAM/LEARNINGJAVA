
class Theater {
    private int theaterId;
    private String name;
    private String location;
    private int capacity;

    public Theater(int theaterId, String name, String location, int capacity) {
        this.theaterId = theaterId;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }
}