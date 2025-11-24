package racinggame.domain.model;

public class Location {
    
    public static final int INIT_LOCATION = 0;
    private int location;
    
    public Location() {
        this.location = INIT_LOCATION;
    }
    
    public Location(int location) {
        this.location = location;
    }
    
    public void increaseLocation() {
        this.location++;
    }
    
    public boolean isMaxLocation(int num) {
        return this.location > num;
    }
    
    public boolean isSameLocation(int max) {
        return this.location == max;
    }
    
    public int getLocation() {
        return location;
    }
}
