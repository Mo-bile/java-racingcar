package racinggame.domain.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
    
    @Test
    void 차는_앞으로_이동한다() {
        Car car = new Car("mo",5);
        car.race();
        
        assertThat(car.findLocation()).isEqualTo(6);
    }
    
    @Test
    void 차의_처음위치는_0이다() {
        Car car = new Car("mo");
        assertThat(car.findLocation()).isEqualTo(0);
    }
    
}