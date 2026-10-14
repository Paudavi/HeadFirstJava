package JukeBoxes;

import java.util.Collections;
import java.util.List;

public class JukeBox2 {
    public static void main(String[] args) {
        JukeBox2 j = new JukeBox2();
        j.go();
    }

    public void go(){
        List<Song2> songs = MockSongs.getSongsV2();
        System.out.println(songs);
        Collections.sort(songs);
        System.out.println(songs);
    }

}
