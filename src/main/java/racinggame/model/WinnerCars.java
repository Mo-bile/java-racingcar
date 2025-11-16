package racinggame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record WinnerCars(List<Car> cars) {
    
    public WinnerCars(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        WinnerCars that = (WinnerCars) o;
        return Objects.equals(cars, that.cars);
    }
    
}
