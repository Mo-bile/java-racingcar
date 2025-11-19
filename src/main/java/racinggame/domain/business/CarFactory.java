package racinggame.domain.business;

import java.util.ArrayList;
import java.util.List;
import racinggame.domain.model.Car;

public class CarFactory {
    
    public static List<Car> createCars(String carsName) {
        String[] names = carsName.split(",");
        List<Car> cars = new ArrayList<>();
        for(String name: names) {
            cars.add(new Car(name));
        }
        return cars;
    }
    
}
