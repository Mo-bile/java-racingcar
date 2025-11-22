package racinggame.domain.business;

import racinggame.domain.model.Cars;
import racinggame.domain.model.RaceCount;
import racinggame.domain.model.RacingResult;

public record RacingGame(RaceCount raceCount, Cars cars) {
    
    public static final int DEFAULT_COUNT = 1;
    
    public RacingGame(String carsName) {
        this(carsName, DEFAULT_COUNT);
    }
    
    public RacingGame(String carsName, int raceCount) {
        this(new RaceCount(raceCount), new Cars(carsName));
    }
    
    public void race() {
        this.cars.carsRace();
        this.raceCount.decreaseCount();
    }
    
    public RacingResult raceResult() {
        return new RacingResult(this.cars);
    }
    
    public boolean isEnd() {
        return !raceCount.isZeroOrLower();
    }
    
}
