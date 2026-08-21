package NewDotCom;

import java.util.ArrayList;

public class DotComBust {
    private ArrayList<DotCom> dotComs;
    private GameHelper gameHelper = new GameHelper();
    private int numbGuesses = 0;

   public void setUpGame(){
    dotComs.add(new DotCom("Bubble.com"));
    dotComs.add(new DotCom("Air.com"));
    dotComs.add(new DotCom("Fire.com"));
    System.out.println("Play the game");
   }

   public void startPlaying(){

   }

   public void  checkUserGuesses(){

   }

   public void finishGame(){

   }
}
