package racinggame.domain.model;

import static racinggame.domain.util.RandomUtil.generateInt;

import java.util.Arrays;
import java.util.List;

public record Cars(List<Car> carList) {
    
    public Cars(String carsName) {
        this(createCars(carsName));
    }
    
    public static List<Car> createCars(String carsName) {
        return Arrays.stream(carsName.split(","))
            .map(Car::new)
            .toList();
    }
    
    public void carsRace() {
        for(Car car: this.carList) {
            car.race(generateInt());
        }
    }
    
    public WinnerCarsName findWinners() {
        return findMaxLocationCar(findMaxNum());
    }
    
    private int findMaxNum() {
        return this.carList.stream()
            .mapToInt(Car::findLocation)
            .max()
            .orElse(0);
    }
    
    private WinnerCarsName findMaxLocationCar(int maxNum) {
        return new WinnerCarsName(
            this.carList.stream()
                .filter(car -> car.isSameLocationCar(maxNum))
                .map(Car::showName)
                .toList());
    }
    
}
