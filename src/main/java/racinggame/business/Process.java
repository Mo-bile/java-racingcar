package racinggame.business;

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
        GameResult gameResult = move.moveCar(joinCars);
        return new GameResponse(gameResult, gameResult.findLastRaceRecord().findGameWinners().WinnerCarsName());
    }
}