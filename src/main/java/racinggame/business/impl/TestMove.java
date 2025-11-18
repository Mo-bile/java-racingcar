package racinggame.business.impl;

import java.util.ArrayList;
import java.util.List;
import racinggame.business.Move;
import racinggame.model.JoinCars;
import racinggame.model.ProgressRecord;

public record TestMove(int moves) implements Move {
    
    public List<ProgressRecord> moveCar(JoinCars joinCars) {
        List<ProgressRecord> progressRecords = new ArrayList<>();
        for(int i = 0; i < this.moves; i++) {
            joinCars.cars().getLast().forward(4);
        }
        progressRecords.add(joinCars.toProcessRecord());
        return progressRecords;
    }
}
