package racinggame.business;

import static org.assertj.core.api.Assertions.*;
import static racinggame.business.CarFactory.createCars;

import java.util.List;
import org.junit.jupiter.api.Test;
import racinggame.model.*;

class GameMoveTest {


    @Test
    void ruesSetTest() {
        assertThat(new GameMove(new NonNegativeMoves(5))).isNotNull();
    }

    @Test
    void moveCountTest() {
        int moveCount = 5;
        String[] strings = {"pobi", "crong","honux"};
        GameMove gameMove = new GameMove((new NonNegativeMoves(moveCount)));
        JoinCars cars = createCars(new NonNegativeReadyCars(strings));
        List<ProgressRecord> progressRecords = gameMove.moveCar(cars);
        
        assertThat(progressRecords)
            .allSatisfy(ProgressRecord::joinCars).hasSize(moveCount);
    }
    
    @Test
    void CarCountTest() {
        int moveCount = 5;
        String[] strings = {"pobi", "crong","honux"};
        GameMove gameMove = new GameMove((new NonNegativeMoves(moveCount)));
        JoinCars cars = createCars(new NonNegativeReadyCars(strings));
        List<ProgressRecord> progressRecords = gameMove.moveCar(cars);
        
        assertThat(progressRecords)
            .allSatisfy(progressRecord ->
                assertThat(progressRecord.joinCars().cars()).hasSize(strings.length)
        );
    }

}