package racinggame.domain.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
    
    @Test
    void 차는_난수_4이상이면_앞으로_이동한다() {
        Car car = new Car("mo",5);
        car.race(4);
        
        assertThat(car.findLocation()).isEqualTo(6);
    }
    
    @Test
    void 차는_난수4이하면_앞으로_이동하지않는다() {
        Car car = new Car("mo",5);
        car.race(3);
        
        assertThat(car.findLocation()).isEqualTo(5);
    }
    
    
}