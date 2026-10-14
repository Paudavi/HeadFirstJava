package JukeBoxes;

public class Song2 implements Comparable<Song2>{
    private String title;
    private String artist;
    private int bpm;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    Song2(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String toString(){
        return title;
    }

    @Override
    public int compareTo(Song2 s) {
        return title.compareTo(s.getTitle());
    }
}
