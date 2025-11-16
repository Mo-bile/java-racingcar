package racinggame.response;

import racinggame.model.GameResult;
import racinggame.model.WinnerCars;

public record GameResponse(GameResult gameResult, WinnerCars winners) {

}
