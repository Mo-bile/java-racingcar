package racinggame;

import racinggame.business.impl.GameMove;
import racinggame.business.Process;
import racinggame.response.GameResponse;

public class GameApplication {
    
    public static void main(String[] args) {
        String[] inputCarName = InputView.inputCarName();
        int carMoves = InputView.inputMoveNum();

        GameResponse response = new Process(new GameMove(carMoves), inputCarName).run();

        ResultView.printAllResult(response);
    }

}
