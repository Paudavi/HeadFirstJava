package JukeBoxes;

public class SongV4 implements Comparable<SongV4> {
    private String title;
    private String artists;
    private int bpm;

    public boolean equals (Object aSong) {
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }

    @Override 
    public int hashCode(){
        return title.hashCode();
    }

    public int compareTo(SongV4 song){
        return title.compareTo(song.getTitle());
    }

    SongV4(String title, String artist, int bpm) {
        this.title = title;
        this.artists = artist;
        this.bpm = bpm;
    }

    public String getArtists() {
        return artists;
    }

    public int getBpm() {
        return bpm;
    }

    public String getTitle(){
        return this.title;
    }

    @Override 
    public String toString(){
        return this.title;
    }
    
}
