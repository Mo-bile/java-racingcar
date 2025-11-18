package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public record ProgressRecord(List<Car> cars) {

    public WinnerCars findGameWinners() {
        return findMaxCar(findMaxLocation());
    }

    private int findMaxLocation() {
        int max = Integer.MIN_VALUE;
        for(Car joinCar: this.cars) {
            max = joinCar.compareLocation(max);
        }
        return max;
    }

    private WinnerCars findMaxCar(int max) {
        List<Car> winnerCars = new ArrayList<>();
        for(Car joinCar: this.cars) {
            if(joinCar.isSameLocation(max)) {
                winnerCars.add(joinCar);
            }
        }
        return new WinnerCars(winnerCars);
    }
}
