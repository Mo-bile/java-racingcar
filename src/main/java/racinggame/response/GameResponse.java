package racinggame.response;

import racinggame.model.GameResult;
import racinggame.model.JoinCars;

public record GameResponse(GameResult gameResult, JoinCars winners) {

}
