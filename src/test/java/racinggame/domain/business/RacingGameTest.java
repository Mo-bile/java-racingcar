package racinggame.domain.business;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racinggame.domain.model.RacingResult;

class RacingGameTest {
    
    @Test
    void 입력받은_게임횟수에_도달하면_끝인지() {
        RacingGame racingGame = new RacingGame("mo,jae",2);
        racingGame.race();
        racingGame.race();
        
        assertThat(racingGame.isEnd()).isFalse();
    }
    
    @Test
    void 차들을_레이스에_출전시킨_후_결과를_받는다() {
        RacingGame racingGame = new RacingGame("mo,jae");
        racingGame.race();
        RacingResult result = racingGame.raceResult();
        assertThat(result).isNotNull();
    }
    
}