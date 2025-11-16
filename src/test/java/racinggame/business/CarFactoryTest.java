package racinggame.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racinggame.business.CarFactory.createCars;

import org.junit.jupiter.api.Test;
import racinggame.model.NonNegativeReadyCars;

class CarFactoryTest {


    @Test
    void carMakeTest() {
        String[] strings = {"pobi", "crong","honux"};
        assertThat(createCars(new NonNegativeReadyCars(strings)).cars()).hasSize(strings.length);
    }

}