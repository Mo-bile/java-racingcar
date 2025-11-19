package racinggame.domain.business;

import static racinggame.domain.business.CarFactory.createCars;

import java.util.List;
import racinggame.domain.model.Car;
import racinggame.domain.model.RacingResult;

public class RacingGame {
    
    public static final int DEFAULT_COUNT = 1;
    private String carsName;
    private int raceCount;
    
    public RacingGame(String carsName) {
        this(carsName, DEFAULT_COUNT);
    }
    
    public RacingGame(String carsName, int raceCount) {
        this.carsName = carsName;
        this.raceCount = raceCount;
    }
    
    public RacingResult race() {
        List<Car> cars = createCars(this.carsName);
        for(Car car: cars) {
            car.race();
        }
        this.raceCount --;
        return new RacingResult(cars);
    }
    
    public boolean isEnd(){
        return this.raceCount <= 0;
    }
    
}
