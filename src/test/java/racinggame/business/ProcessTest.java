package racinggame.business;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racinggame.business.impl.TestMove;
import racinggame.model.Car;
import racinggame.response.GameResponse;

import java.util.List;

class ProcessTest {

    @ParameterizedTest
    @CsvSource(value = {"pobi,crong:5", "pobi,crong:6"}, delimiter = ':')
    void carsWinnerTest(String names, int moves) {
        String[] carsNames = names.split(",");
        GameResponse gameResponse = new Process(new TestMove(moves), carsNames).run();

        String carsName = carsNames[carsNames.length - 1];
        assertThat(gameResponse.winners().getLast()).isEqualTo(carsName);
    }
    
    @ParameterizedTest
    @CsvSource(value = {"pobi,crong:5", "pobi,crong:6"}, delimiter = ':')
    void gameRespTest(String names, int moves) {
        String[] carsNames = names.split(",");
        GameResponse gameResponse = new Process(new TestMove(moves), carsNames).run();

        List<Car> joinCars = gameResponse.gameResult().findLastRaceRecord().cars();;
        assertThat(joinCars.getFirst().findLocation()).isEqualTo(0);
        assertThat(joinCars.getLast().findLocation()).isEqualTo(moves);
    }
}