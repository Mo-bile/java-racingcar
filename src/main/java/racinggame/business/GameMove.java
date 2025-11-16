package racinggame.business;

import racinggame.model.*;

import java.util.ArrayList;
import java.util.List;

public record GameMove(NonNegativeMoves moves) {
    
    public GameResult moveCar(JoinCars joinCars) {
        List<ProgressRecord> progressRecords = new ArrayList<>();
        for(int i = 0; i < this.moves.moves(); i++) {
            joinCars.race(progressRecords);
        }
        return new GameResult(progressRecords);
    }
    
}
