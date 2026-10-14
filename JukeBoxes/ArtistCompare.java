package JukeBoxes;

import java.util.Comparator;

class ArtistCompare implements  Comparator<Song2>{

    @Override 
    public int compare(Song2 one, Song2 two){
        return one.getArtist().compareTo(two.getArtist());
    }

}