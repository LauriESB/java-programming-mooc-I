
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Song)) {
            return false;
        }
        
        Song convertComparedToSong = (Song) compared;
        
        if (this.artist.equals(convertComparedToSong.artist) &&
            this.durationInSeconds == convertComparedToSong.durationInSeconds &&
            this.name.equals(convertComparedToSong.name)) {
            return true;
        }
        
        return false;
    }


}
