package racinggame.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class GameResultTest {
    
    GameResult gameResult;
    
    @Test
    void getGameResultTest() {
        List<ProgressRecord> progressRecords = new ArrayList<>();
        progressRecords.add(new JoinCars(new ArrayList<>()).toProcessRecord());
        gameResult = new GameResult(progressRecords);
        assertThat(gameResult.progressRecords().size()).isEqualTo(1);
    }
    
}