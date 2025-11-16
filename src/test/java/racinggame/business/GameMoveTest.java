package racinggame.business;

import static org.assertj.core.api.Assertions.*;
import static racinggame.business.CarFactory.createCars;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.model.*;

class GameMoveTest {
    
    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void moveSetTest(int num) {
        assertThatThrownBy(() -> {
            new GameMove(num);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("%s", "이동횟수에 입력이 생략되거나, 0이하");
    }

    @Test
    void ruesSetTest() {
        assertThat(new GameMove(5)).isNotNull();
    }

    @Test
    void moveCountTest() {
        int moveCount = 5;
        String[] strings = {"pobi", "crong","honux"};
        GameMove gameMove = new GameMove((moveCount));
        JoinCars cars = createCars(strings);
        List<ProgressRecord> progressRecords = gameMove.moveCar(cars);
        
        assertThat(progressRecords)
            .allSatisfy(ProgressRecord::joinCars).hasSize(moveCount);
    }
    
    @Test
    void CarCountTest() {
        int moveCount = 5;
        String[] strings = {"pobi", "crong","honux"};
        GameMove gameMove = new GameMove((moveCount));
        JoinCars cars = createCars(strings);
        List<ProgressRecord> progressRecords = gameMove.moveCar(cars);
        
        assertThat(progressRecords)
            .allSatisfy(progressRecord ->
                assertThat(progressRecord.joinCars().cars()).hasSize(strings.length)
        );
    }

}