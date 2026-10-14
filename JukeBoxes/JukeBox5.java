package JukeBoxes;

import java.util.List;

public class JukeBox5 {

    public static void main(String[] args) {
        JukeBox5 j = new JukeBox5();
        j.go();
    }
    public void go(){
        List<Song2> songs = MockSongs.getSongsV2();
        System.out.println(songs);
        songs.sort((one,two) -> one.getBpm() - (two.getBpm()));
        System.out.println(songs);
    }
}
