package racinggame.domain.model;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class RacingResultTest {
    
    @Test
    void 게임기록중_1등을_찾아서_이름을_리턴한다() {
        List<Car> cars = List.of(new Car("mo", 3), new Car("jae", 5));
        List<String> winners = new RacingResult(cars).findWinners();
        
        List<String> expectedWinners = List.of("jae");
        
        assertThat(winners).isEqualTo(expectedWinners);
    }
    
    @Test
    void 게임기록중_공동_1등을_찾아서_이름을_리턴한다() {
        List<Car> cars = List.of(new Car("mo", 3), new Car("jae", 5), new Car("young", 5));
        List<String> winners = new RacingResult(cars).findWinners();
        
        List<String> expectedWinners = List.of("jae","young");
        
        assertThat(winners).isEqualTo(expectedWinners);
    }
    
}