package DotCom;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public String checkYourself(String stringGuess) {
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(ArrayList<String> array) {
        locationCells = array;
    }

    public static void main(String[] args) {
        int numbGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<String> locations = new ArrayList<>(List.of("1","2","3"));
        dot.setLocationCells(locations);
        boolean flag = true;
        while (flag) {
            String guess = helper.getUserInput("Make ur guess");
            String result = dot.checkYourself(guess);
            numbGuesses++;
            if (result.equals("kill")) {
                flag = false;
                System.out.println("it took u " + numbGuesses + " guesses");
            }
        }
    }
}
