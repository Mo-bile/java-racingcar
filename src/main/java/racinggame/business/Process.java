package racinggame.business;

import racinggame.response.GameResponse;

public interface Process {
    public GameResponse run(String[] names, int moves) ;
}
