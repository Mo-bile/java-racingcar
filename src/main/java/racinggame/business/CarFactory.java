package racinggame.business;

import java.util.ArrayList;
import java.util.List;
import racinggame.model.Car;
import racinggame.model.JoinCars;
import racinggame.model.NonNegativeReadyCars;

public class CarFactory {
    
    public static JoinCars createCars(NonNegativeReadyCars names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names.names()) {
            cars.add(new Car(name));
        }
        return new JoinCars(cars);
    }
    
}
