package JukeBoxes;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getSongsStrings() {
        List<String> songs = new ArrayList<>();
        songs.add("Carless Whisper");
        songs.add("Cuando yo me muera");
        songs.add("Baby");
        songs.add("Callaita");
        return songs;
    }

    public static List<Song2> getSongsV2() {
        List<Song2> songs = new ArrayList<>();
        songs.add(new Song2("somersault", "zero 7", 147));
        songs.add(new Song2("cassidy", "grateful dead", 158));
        songs.add(new Song2("$10", "hitchhiker", 140));
        songs.add(new Song2("havana", "cabello", 105));
        songs.add(new Song2("Cassidy", "grateful dead", 158));
        songs.add(new Song2("50 ways", "simon", 102));
        return songs;
    }

    public static List<SongV4> getSongsV4(){
       List<SongV4> songs = new ArrayList<>();
        songs.add(new SongV4("somersault", "zero 7", 147));
        songs.add(new SongV4("cassidy", "grateful dead", 158));
        songs.add(new SongV4("cassidy", "grateful dead", 158));
        songs.add(new SongV4("$10", "hitchhiker", 140));
        songs.add(new SongV4("havana", "cabello", 105));
        songs.add(new SongV4("Cassidy", "grateful dead", 158));
        songs.add(new SongV4("50 ways", "simon", 102));
        return songs; 
    }
}
