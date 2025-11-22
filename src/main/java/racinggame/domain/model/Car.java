package racinggame.domain.model;

public class Car {
    
    public static final int INIT_LOCATION = 0;
    public static final int MOVE_CONDITION = 3;
    private final Name name;
    private int location;
    
    public Car(String name) {
        this(new Name(name), INIT_LOCATION);
    }
    
    public Car(String name, int location) {
        this(new Name(name), location);
    }
    
    public Car(Name name, int location) {
        this.name = name;
        this.location = location;
    }
    
    public void race(int randNum) {
        if(isMoveLocation(randNum)) {
            this.location++;
        }
    }
    
    private boolean isMoveLocation(int randNum) {
        return randNum > MOVE_CONDITION;
    }
    
    public int findLocation() {
        return this.location;
    }
    
    public String showName() {
        return this.name.getName();
    }
    
    public boolean isMaxNum(int max) {
        return this.location > max;
    }
    
    public boolean isSameLocationCar(int max) {
        return this.location == max;
    }
}
