package racinggame.domain.model;

public class RaceCount {
    
    private int raceCount;
    
    public RaceCount(int raceCount) {
        this.raceCount = raceCount;
    }
    
    public void decreaseCount() {
        raceCount--;
    }
    
    public boolean isPositive() {
        return this.raceCount >= 0;
    }
}
