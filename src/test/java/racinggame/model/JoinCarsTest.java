package racinggame.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class JoinCarsTest {
    
    @Test
    void addJoinCarsTest() {
        JoinCars joinCars = new JoinCars(List.of(new Car("pobi")));
        joinCars.addJoinCars(new Car("mo"));
        
        JoinCars expectedJoinCars = new JoinCars(List.of(new Car("pobi"),new Car("mo")));
        
        assertThat(joinCars).isEqualTo(expectedJoinCars);
    }

}