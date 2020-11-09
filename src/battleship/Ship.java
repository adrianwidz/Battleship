package battleship;

public class Ship {

    private String name;
    private int size;
    private String[] location;

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
        this.location = new String[size];
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void damage() {
        size -= 1;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String[] getLocation() {
        return location;
    }
}
