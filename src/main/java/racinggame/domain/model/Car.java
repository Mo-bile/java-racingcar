package racinggame.domain.model;

public class Car {
    
    public static final int INIT_LOCATION = 0;
    private final String name;
    private int location;
    
    public Car(String name) {
        this(name, INIT_LOCATION);
    }
    
    public Car(String name, int location) {
        this.name = name;
        this.location = location;
    }
    
    public void race() {
        this.location++;
    }
    
    public int findLocation() {
        return this.location;
    }
    
    
}
