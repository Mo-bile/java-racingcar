package racinggame.domain.business;

import racinggame.domain.model.Cars;
import racinggame.domain.model.RaceCount;
import racinggame.domain.model.RacingResult;

public class RacingGame {
    
    public static final int DEFAULT_COUNT = 1;
    private final RaceCount raceCount;
    private final Cars cars;
    
    public RacingGame(String carsName) {
        this(carsName, DEFAULT_COUNT);
    }
    
    public RacingGame(String carsName, int raceCount) {
        this.cars = new Cars(carsName);
        this.raceCount = new RaceCount(raceCount);
    }
    
    public RacingGame(RaceCount raceCount, Cars cars) {
        this.raceCount = raceCount;
        this.cars = cars;
    }
    
    public void race() {
        this.cars.carsRace();
        this.raceCount.decreaseCount();
    }
    
    public RacingResult raceResult() {
        return new RacingResult(this.cars);
    }
    
    public boolean isEnd(){
        return !raceCount.isZeroOrLower();
    }
    
}
