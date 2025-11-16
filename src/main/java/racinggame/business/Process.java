package racinggame.business;

import racinggame.model.*;
import racinggame.response.GameResponse;

public class Process {
    
    public GameResponse run(String[] names, int moves) {
        JoinCars joinCars = CarFactory.createCars(new NonNegativeReadyCars(names));
        GameResult gameResult = new GameMove(new NonNegativeMoves(moves)).moveCar(joinCars);
        WinnerCars gameWinners = gameResult.findGameWinners();
        return new GameResponse(gameResult, gameWinners);
    }
}