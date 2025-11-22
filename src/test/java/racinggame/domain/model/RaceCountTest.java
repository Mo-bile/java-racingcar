package racinggame.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaceCountTest {
    
    @Test
    public void 남은_횟수는_1씩_줄어서_0이다() {
        RaceCount raceCount = new RaceCount(2);
        raceCount.decreaseCount();
        raceCount.decreaseCount();
        assertThat(raceCount.isZero()).isTrue();
    }
    

}