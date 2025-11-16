package racinggame.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ProgressRecordTest {
    
    ProgressRecord progressRecord;
    
    @Test
    void findJointWinnersTest() {
        List<Car> joinCars = new ArrayList<>();
        joinCars.add(new Car("pobi",5));
        joinCars.add(new Car("crong",5));
        joinCars.add(new Car("mo",3));
        joinCars.add(new Car("jae",2));
        JoinCars jc = new JoinCars(joinCars);
        ProgressRecord progressRecord = new ProgressRecord(jc);
        List<ProgressRecord> progressRecords = List.of(progressRecord);
        
        List<Car> expectWinnerCars = List.of(new Car("pobi",5), new Car("crong",5));
        WinnerCars winner = new WinnerCars(expectWinnerCars);
        
        assertThat(progressRecords.getLast().findGameWinners()).isEqualTo(winner);
    }
    
    @Test
    void findSoleWinnersTest() {
        List<Car> joinCars = new ArrayList<>();
        joinCars.add(new Car("pobi",4));
        joinCars.add(new Car("crong",5));
        joinCars.add(new Car("mo",3));
        joinCars.add(new Car("jae",2));
        JoinCars jc = new JoinCars(joinCars);
        ProgressRecord progressRecord = new ProgressRecord(jc);
        List<ProgressRecord> progressRecords = List.of(progressRecord);
        
        List<Car> expectWinnerCars = List.of(new Car("crong",5));
        WinnerCars winner = new WinnerCars(expectWinnerCars);
        
        assertThat(progressRecords.getLast().findGameWinners()).isEqualTo(winner);
    }

}