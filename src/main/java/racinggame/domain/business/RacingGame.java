package racinggame.domain.business;

import static racinggame.domain.util.RandomUtil.generateInt;

import racinggame.domain.model.Car;
import racinggame.domain.model.Cars;
import racinggame.domain.model.RacingResult;

public class RacingGame {
    
    public static final int DEFAULT_COUNT = 1;
    private int raceCount;
    private final Cars cars;
    
    public RacingGame(String carsName) {
        this(carsName, DEFAULT_COUNT);
    }
    
    public RacingGame(String carsName, int raceCount) {
        this.cars = new Cars(carsName);
        this.raceCount = raceCount;
    }
    
    public RacingResult race() {
        this.cars.carsRace();
        this.raceCount --;
        return new RacingResult(this.cars);
    }
    
    public boolean isEnd(){
        return this.raceCount > 0;
    }
    
}
