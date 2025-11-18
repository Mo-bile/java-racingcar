package racinggame.business;

import java.util.List;

import racinggame.model.GameResult;
import racinggame.model.JoinCars;
import racinggame.model.ProgressRecord;

public interface Move {
    public GameResult moveCar(JoinCars joinCars);
}
