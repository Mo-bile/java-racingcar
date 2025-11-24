package racinggame.controller;

import racinggame.domain.business.RacingGame;
import racinggame.domain.model.RacingResult;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class RacingGameApplication {
    
    public static void main(String[] args) {
        String carNames = InputView.inputCarName();
        int raceCount = InputView.inputMoveNum();
        
        RacingGame racingGame = new RacingGame(carNames, raceCount);
        
        while(racingGame.isEnd()) {
            racingGame.race();
            ResultView.printAllResult(racingGame.raceResult());
        }
        ResultView.winnersPrint(racingGame.findWinners());
    }
    
}
