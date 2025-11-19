package racinggame.view;

//import java.util.ArrayList;
//import java.util.List;
//import racinggame.model.Car;
//import racinggame.response.GameResponse;
//import racinggame.model.ProgressRecord;

import racinggame.domain.model.RacingResult;

public class ResultView {
    
    public static void printAllResult(RacingResult results) {
        System.out.println("실행 결과");
        for (int i = 0; i < results.cars().size() ; i++) {
            System.out.print(results.cars().get(i).showName() + " : ");
            System.out.println(makeTrack(results.cars().get(i).findLocation()));
        }
        System.out.println();
//        winnersPrint(results.winners());
    }
//
//    private static void winnersPrint(List<String> winners) {
//        List<String> carsName = new ArrayList<>();
//        for(String winner: winners) {
//            carsName.add(winner);
//        }
//        System.out.print(String.join(",", carsName));
//        System.out.print("가 최종 우승했습니다.");
//    }
//
    static String makeTrack(int location) {
        return "-".repeat(location);
    }
}

