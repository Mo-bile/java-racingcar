package racinggame.domain.model;

public class Car {
    
    public static final int INIT_LOCATION = 0;
    public static final int MOVE_CONDITION = 3;
    private final Name name;
    private final Location location;
    
    public Car(String name) {
        this(new Name(name), INIT_LOCATION);
    }
    
    public Car(String name, int location) {
        this(new Name(name), new Location(location));
    }
    
    public Car(Name name, int location) {
        this(name, new Location(location));
    }
    
    public Car(Name name, Location location) {
        this.name = name;
        this.location = location;
    }
    
    public void race(int randNum) {
        if(isMoveLocation(randNum)) {
            this.location.increaseLocation();
        }
    }
    
    private boolean isMoveLocation(int randNum) {
        return randNum > MOVE_CONDITION;
    }
    
    public int findLocation() {
        return this.location.getLocation();
    }
    
    public String showName() {
        return this.name.getName();
    }
    
    public boolean isSameLocationCar(int max) {
        return this.location.isSameLocation(max);
    }
}
