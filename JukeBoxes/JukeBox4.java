package JukeBoxes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JukeBox4 {
    public void go() {
        List<Song2> songs = MockSongs.getSongsV2();

        System.out.println(songs);

        Collections.sort(songs);
        System.out.println(songs);
        ArtistCompare artistCompare = new ArtistCompare();
        songs.sort(artistCompare);
        System.out.println(songs);

        songs.sort(new Comparator<Song2>() {
            public int compare(Song2 one, Song2 two) {
                return one.getTitle().compareTo(two.getTitle());
            }
        });
        System.out.println(songs);

        songs.sort((artistCompare));
    }

    public static void main(String[] args) {
        JukeBox4 j = new JukeBox4();
        j.go();
    }

}

class TitleCompare implements Comparator<Song2> {
    public int compare(Song2 one, Song2 two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}