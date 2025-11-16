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
    
    
    @Test
    void findJointWinnersTest() {
        List<Car> joinCars = new ArrayList<>();
        joinCars.add(new Car("pobi",5));
        joinCars.add(new Car("crong",5));
        joinCars.add(new Car("mo",3));
        joinCars.add(new Car("jae",2));
        JoinCars jc = new JoinCars(joinCars);
        
        WinnerCars expectedWc = new WinnerCars(List.of(new Car("pobi",5), new Car("crong",5)));
        assertThat(jc.findWinners()).isEqualTo(expectedWc);
    }
    
    @Test
    void findSoleWinnersTest() {
        List<Car> joinCars = new ArrayList<>();
        joinCars.add(new Car("pobi",4));
        joinCars.add(new Car("crong",5));
        joinCars.add(new Car("mo",3));
        joinCars.add(new Car("jae",2));
        JoinCars jc = new JoinCars(joinCars);
        
        WinnerCars expectedJc = new WinnerCars(List.of(new Car("crong",5)));
        assertThat(jc.findWinners()).isEqualTo(expectedJc);
    }
    
}