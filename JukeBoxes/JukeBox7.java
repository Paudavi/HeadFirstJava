package JukeBoxes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JukeBox7 {
    public static void main(String[] args) {
        JukeBox7 j = new JukeBox7();
        j.go();
    }
    public void go() {
        List<Song2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        Set<Song2> songsSet = new HashSet<>(songList);
        System.out.println(songsSet);

    }
}
