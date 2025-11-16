package racinggame;

import racinggame.business.Process;
import racinggame.business.impl.GameProcess;

public class GameApplication {
    
    public static void main(String[] args) {
        Process process = new GameProcess();
        ResultView.printAllResult(process.run(InputView.inputCarName(), InputView.inputMoveNum()));
    }

}
