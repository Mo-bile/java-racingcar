package racinggame.domain.model;

import java.util.ArrayList;
import java.util.List;

public record RacingResult(List<Car> cars) {
    
    public List<String> findWinners() {
        return findMaxLocationCar(findMaxNum());
    }
    
    private int findMaxNum() {
        int max = 0;
        for(Car car: cars) {
            if(car.findLocation() > max) {
                max = car.findLocation();
            }
        }
        return max;
    }
    
    private List<String> findMaxLocationCar(int maxNum) {
        List<String> carsName = new ArrayList<>();
        for(Car car: cars) {
            if(car.findLocation() == maxNum) {
                carsName.add(car.showName());
            }
        }
        return carsName;
    }
}
