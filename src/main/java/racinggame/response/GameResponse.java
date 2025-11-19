package racinggame.response;

import racinggame.model.GameResult;
import racinggame.model.WinnerCars;

import java.util.List;

public record GameResponse(GameResult gameResult, List<String> winners) {

}
