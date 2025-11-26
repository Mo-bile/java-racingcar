package racinggame.domain.model;

import java.util.List;

public record RacingResult(Cars cars) {
    
    public List<Car> getCarList() {
        return cars.carList();
    }
}
