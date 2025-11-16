package racinggame.business;

import java.util.List;
import racinggame.model.JoinCars;
import racinggame.model.ProgressRecord;

public interface Move {
    public List<ProgressRecord> moveCar(JoinCars joinCars);
}
