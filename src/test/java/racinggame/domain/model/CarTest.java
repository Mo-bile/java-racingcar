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
    
    @Test
    void 차의_처음위치는_0이다() {
        Car car = new Car("mo");
        assertThat(car.findLocation()).isEqualTo(0);
    }
    
    @Test
    void 차의_현재위치는_최대값보다_크다() {
        Car car = new Car("mo", 5);
        assertThat(car.isMaxNum(4)).isTrue();
    }
    
    @Test
    void 차의_최댓값위치에_있는_차는_mo이다() {
        Car car = new Car("mo", 5);
        assertThat(car.isSameLocationCar(5)).isTrue();
    }
    
    @Test
    void 차의_최댓값위치에_있는_차는_mo_가_아니다() {
        Car car = new Car("mo", 6);
        assertThat(car.isSameLocationCar(5)).isFalse();
    }
    
}