package racinggame.business;

import racinggame.model.*;

import java.util.ArrayList;
import java.util.List;

public record GameMove(NonNegativeMoves moves) {
    
    public List<ProgressRecord> moveCar(JoinCars joinCars) {
        List<ProgressRecord> progressRecords = new ArrayList<>();
        for(int i = 0; i < this.moves.moves(); i++) {
            joinCars.race(progressRecords);
        }
        return progressRecords;
    }
    
}
