package racinggame.domain.business;

import static racinggame.domain.business.CarFactory.createCars;
import static racinggame.domain.util.RandomUtil.generateInt;

import java.util.List;
import racinggame.domain.model.Car;
import racinggame.domain.model.RacingResult;

public class RacingGame {
    
    public static final int DEFAULT_COUNT = 1;
    private int raceCount;
    private final List<Car> cars;
    
    public RacingGame(String carsName) {
        this(carsName, DEFAULT_COUNT);
    }
    
    public RacingGame(String carsName, int raceCount) {
        this.cars = createCars(carsName);
        this.raceCount = raceCount;
    }
    
    public RacingResult race() {
        for(Car car: this.cars) {
            car.race(generateInt());
        }
        this.raceCount --;
        return new RacingResult(this.cars);
    }
    
    public boolean isEnd(){
        return this.raceCount > 0;
    }
    
}
