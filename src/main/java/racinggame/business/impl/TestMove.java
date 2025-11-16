package racinggame.business.impl;

import java.util.ArrayList;
import java.util.List;
import racinggame.business.Move;
import racinggame.model.JoinCars;
import racinggame.model.ProgressRecord;

public record TestMove(int moves) implements Move {
    
    public TestMove {
        validate(moves);
    }
    
    public List<ProgressRecord> moveCar(JoinCars joinCars) {
        List<ProgressRecord> progressRecords = new ArrayList<>();
        for(int i = 0; i < this.moves; i++) {
            joinCars.cars().getLast().forward(4);
        }
        progressRecords.add(new ProgressRecord(joinCars));
        return progressRecords;
    }
    
    private void validate(int moves) {
        if(moves < 1) {
            throw new IllegalArgumentException("이동횟수에 입력이 생략되거나, 0이하");
        }
    }
    
    
}
