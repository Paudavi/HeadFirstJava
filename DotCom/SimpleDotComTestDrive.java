package DotCom;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<String> locations = new ArrayList<>(List.of("1","2","3"));
        dot.setLocationCells(locations);
        String userGuess = "7";
        String result = dot.checkYourself(userGuess);
        String testResult = "fail";
        if(result.equals("hit")) testResult = "passed";
        System.out.println(testResult);
    }
}