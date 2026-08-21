package NewDotCom;

import java.util.ArrayList;

class DotCom {
    private String name;
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    DotCom(String name) {
        this.name = name;
    }
    
    public String checkYourSelf(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index>=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("Bajaste a "+ name);
            } else {
                result = "hit";
            }
        }
        return result;
    }

}
