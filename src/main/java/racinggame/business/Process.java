package racinggame.business;

import java.util.List;
import racinggame.model.*;
import racinggame.response.GameResponse;

public class Process {
    
    public GameResponse run(String[] names, int moves) {
        JoinCars joinCars = CarFactory.createCars(new NonNegativeReadyCars(names));
        List<ProgressRecord> progressRecords = new GameMove(new NonNegativeMoves(moves)).moveCar(joinCars);
        WinnerCars gameWinners = progressRecords.getLast().findGameWinners();
        return new GameResponse(new GameResult(progressRecords), gameWinners);
    }
}