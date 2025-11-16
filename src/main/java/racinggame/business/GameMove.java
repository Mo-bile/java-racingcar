package racinggame.business;

import racinggame.model.*;

import java.util.ArrayList;
import java.util.List;

public record GameMove(int moves) {
    
    public GameMove {
        validate(moves);
    }
    
    public List<ProgressRecord> moveCar(JoinCars joinCars) {
        List<ProgressRecord> progressRecords = new ArrayList<>();
        for(int i = 0; i < this.moves; i++) {
            joinCars.race(progressRecords);
        }
        return progressRecords;
    }
    
    private void validate(int moves) {
        if(moves < 1) {
            throw new IllegalArgumentException("이동횟수에 입력이 생략되거나, 0이하");
        }
    }
    
    
}
