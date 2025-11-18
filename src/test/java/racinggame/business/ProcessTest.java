package racinggame.business;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racinggame.business.impl.TestProcess;
import racinggame.model.Car;
import racinggame.model.JoinCars;
import racinggame.response.GameResponse;

import java.util.List;

class ProcessTest {
    
    Process gp;
    
    @BeforeEach
    void setUp() {
        gp = new TestProcess();
    }
    
    @ParameterizedTest
    @CsvSource(value = {"pobi,crong:5", "pobi,crong:6"}, delimiter = ':')
    void carsWinnerTest(String names, int moves) {
        String[] carsNames = names.split(",");
        GameResponse gameResponse =  gp.run(carsNames, moves);
        
        String carsName = carsNames[carsNames.length - 1];
        assertThat(gameResponse.winners().cars().getLast().getName()).isEqualTo(carsName);
    }
    
    @ParameterizedTest
    @CsvSource(value = {"pobi,crong:5", "pobi,crong:6"}, delimiter = ':')
    void gameRespTest(String names, int moves) {
        String[] carsNames = names.split(",");
        GameResponse gameResponse =  gp.run(carsNames, moves);
        
        List<Car> joinCars = gameResponse.gameResult().progressRecords().getLast().cars();
        assertThat(joinCars.getFirst().findLocation()).isEqualTo(0);
        assertThat(joinCars.getLast().findLocation()).isEqualTo(moves);
    }
}