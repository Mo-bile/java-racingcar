package racinggame;

import racinggame.business.Process;
import racinggame.business.impl.GameProcess;
import racinggame.response.GameResponse;

public class GameApplication {
    
    public static void main(String[] args) {
        String[] inputCarName = InputView.inputCarName();
        int carMoves = InputView.inputMoveNum();

        GameResponse response = new GameProcess().run(inputCarName, carMoves);

        ResultView.printAllResult(response);
    }

}
