package racinggame.view;

import java.util.List;
import racinggame.domain.model.Car;
import racinggame.domain.model.RacingResult;
import racinggame.domain.model.WinnerCarsName;

public class ResultView {
    
    public static void printAllResult(RacingResult results) {
        for (int i = 0; i < results.getCarList().size() ; i++) {
            System.out.print(results.getCarList().get(i).showName() + " : ");
            System.out.println(makeTrack(results.getCarList().get(i).findLocation()));
        }
        System.out.println();
    }
  
    public static void winnersPrint(WinnerCarsName winnersCars) {
        System.out.print(String.join(",", winnersCars.carsName()));
        System.out.print("가 최종 우승했습니다.");
    }
    
    static String makeTrack(int location) {
        return "-".repeat(location);
    }
}

