package racinggame.domain.business;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import racinggame.domain.model.Car;

class CarFactoryTest {
    
    @Test
    void 차이름입력받으면_그수만큼_생성한다() {
        List<Car> cars = CarFactory.createCars("mo,jae");
        assertThat(cars).hasSize(2);
    }
    
}