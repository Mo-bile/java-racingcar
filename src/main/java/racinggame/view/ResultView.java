package racinggame.view;

import java.util.List;
import racinggame.domain.model.Car;
import racinggame.domain.model.RacingResult;

public class ResultView {
    
    public static void printAllResult(RacingResult results) {
        System.out.println("실행 결과");
        for (int i = 0; i < results.getCarList().size() ; i++) {
            System.out.print(results.getCarList().get(i).showName() + " : ");
            System.out.println(makeTrack(results.getCarList().get(i).findLocation()));
        }
        System.out.println();
    }
  
    public static void winnersPrint(RacingResult results) {
        List<String> winners = results.cars().findWinners();
        System.out.print(String.join(",", winners));
        System.out.print("가 최종 우승했습니다.");
    }
    
    static String makeTrack(int location) {
        return "-".repeat(location);
    }
}

