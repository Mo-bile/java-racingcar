package racinggame.business;

import static org.assertj.core.api.Assertions.*;
import static racinggame.business.CarFactory.createCars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.business.impl.GameMove;
import racinggame.business.impl.TestMove;
import racinggame.model.*;

class MoveTest {
    
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
        Move move = new GameMove(moveCount);
        JoinCars cars = createCars(strings);
        GameResult gameResult = move.moveCar(cars);

        assertThat(gameResult.progressRecords())
            .allSatisfy(ProgressRecord::cars).hasSize(moveCount);
    }
    
    @Test
    void CarCountTest() {
        int moveCount = 5;
        String[] strings = {"pobi", "crong","honux"};
        Move move = new GameMove(moveCount);
        JoinCars cars = createCars(strings);
        GameResult gameResult = move.moveCar(cars);

        assertThat(gameResult.progressRecords())
            .allSatisfy(progressRecord ->
                assertThat(progressRecord.cars()).hasSize(strings.length)
        );
    }

        @Test
    void testMoveTest() {
        int moveCount = 5;
        String[] strings = {"pobi", "crong","honux"};
        Move move = new TestMove(moveCount);
        JoinCars cars = createCars(strings);
        GameResult gameResult = move.moveCar(cars);

        assertThat(gameResult.findLastRaceRecord().cars().getLast().findLocation())
            .isEqualTo(moveCount);
    }
}