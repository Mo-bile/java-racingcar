package racinggame.domain.model;

import static racinggame.domain.util.RandomUtil.generateInt;

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
    
    public void race(int randNum) {
        if(isMoveLocation(randNum)) {
            this.location++;
        }
    }
    
    private boolean isMoveLocation(int randNum) {
        return randNum > 3;
    }
    
    public int findLocation() {
        return this.location;
    }
    
    public String showName() {
        return this.name;
    }
}
