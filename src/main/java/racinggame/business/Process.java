package racinggame.business;

import java.util.List;
import racinggame.model.*;
import racinggame.response.GameResponse;

public class Process {

    private String[] names;
    private final Move move;

    public Process(Move move, String[] names) {
        this.names = names;
        this.move = move;
    }

    public GameResponse run() {
        JoinCars joinCars = CarFactory.createCars(names);
        List<ProgressRecord> progressRecords = move.moveCar(joinCars);
        WinnerCars gameWinners = progressRecords.getLast().findGameWinners();
        return new GameResponse(new GameResult(progressRecords), gameWinners.WinnerCarsName());
    }
}