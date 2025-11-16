package racinggame.business;

import java.util.ArrayList;
import java.util.List;
import racinggame.model.Car;
import racinggame.model.JoinCars;

public class CarFactory {
    
    public static JoinCars createCars(String[] names) {
        validateCar(names.length);
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return new JoinCars(cars);
    }
    
    private static void validateCar(int cars) {
        if(cars < 1) {
            throw new IllegalArgumentException("참가시킬 자동차 수 입력이 생략되거나, 0이하");
        }
    }
    
}
