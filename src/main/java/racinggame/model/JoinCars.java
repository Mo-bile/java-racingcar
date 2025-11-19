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
    
    public ProgressRecord race() {
        for(Car car: this.cars()) {
            car.forward(RandomUtil.generateInt());
        }
        return toProcessRecord();
    }

    public ProgressRecord toProcessRecord() {
        List<Car> carRecord = new ArrayList<>();
        for (Car car : this.cars) {
            carRecord.add(new Car(car.getName(), car.findLocation()));
        }
        return new ProgressRecord(carRecord);
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
