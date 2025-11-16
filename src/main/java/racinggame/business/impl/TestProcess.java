package racinggame.business.impl;

import java.util.List;
import racinggame.business.CarFactory;
import racinggame.business.Process;
import racinggame.model.GameResult;
import racinggame.model.JoinCars;
import racinggame.model.ProgressRecord;
import racinggame.model.WinnerCars;
import racinggame.response.GameResponse;

public class TestProcess implements Process {
    
    public GameResponse run(String[] names, int moves) {
        JoinCars joinCars = CarFactory.createCars(names);
        List<ProgressRecord> progressRecords = new TestMove(moves).moveCar(joinCars);
        WinnerCars gameWinners = progressRecords.getLast().findGameWinners();
        return new GameResponse(new GameResult(progressRecords), gameWinners);
    }
}