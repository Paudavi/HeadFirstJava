package JukeBoxes;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JukeBox8 {
    public static void main(String[] args) {
        JukeBox8 juke = new JukeBox8();
        juke.go();
    }

    public void go(){
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);
        songList.sort((one,two)-> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);
    }
}
