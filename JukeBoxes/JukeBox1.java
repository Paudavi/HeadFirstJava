package JukeBoxes;

import java.util.Collections;
import java.util.List;

public class JukeBox1 {
    List<String> songs = MockSongs.getSongsStrings();
    public static void main(String[] args) {
        JukeBox1 jukeBox1 = new JukeBox1();
        jukeBox1.go();
    } 

    public void go(){
        List<String> songs = MockSongs.getSongsStrings();
        System.out.println(songs);
        Collections.sort(songs);
        System.out.println(songs);
    }
}
