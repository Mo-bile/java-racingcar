package racinggame.domain.model;

import static racinggame.domain.util.RandomUtil.generateInt;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    
    List<Car> carList;
    
    public Cars(String carsName) {
        this.carList = createCars(carsName);
    }
    
    public Cars(List<Car> carList) {
        this.carList = carList;
    }
    
    public static List<Car> createCars(String carsName) {
        String[] names = carsName.split(",");
        List<Car> cars = new ArrayList<>();
        for(String name: names) {
            cars.add(new Car(name));
        }
        return cars;
    }
    
    public void carsRace() {
        for(Car car: this.carList) {
            car.race(generateInt());
        }
    }
    
    public List<String> findWinners() {
        return findMaxLocationCar(findMaxNum());
    }
    
    private int findMaxNum() {
        int max = 0;
        for(Car car: carList) {
            if(car.isMaxNum(max)) {
                max = car.findLocation();
            }
        }
        return max;
    }
    
    private List<String> findMaxLocationCar(int maxNum) {
        List<String> carsName = new ArrayList<>();
        for(Car car: carList) {
            if(car.isSameLocationCar(maxNum)) {
                carsName.add(car.showName());
            }
        }
        return carsName;
    }
}
