package racinggame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import racinggame.util.RandomUtil;

public record JoinCars(List<Car> cars) {
    
    public JoinCars {
        cars = new ArrayList<>(cars);
    }
    
    public JoinCars() {
        this(List.of());
    }
    
    public void addJoinCars(Car car) {
        this.cars.add(car);
    }
    
    public WinnerCars findWinners() {
        return findMaxCar(findMaxLocation());
    }
    
    public void race(List<ProgressRecord> progressRecords) {
        for(Car car: this.cars()) {
            car.forward(RandomUtil.generateInt());
        }
        progressRecords.add(new ProgressRecord(this));
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
    
    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        JoinCars joinCars = (JoinCars) o;
        return Objects.equals(cars, joinCars.cars);
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }
    
}
