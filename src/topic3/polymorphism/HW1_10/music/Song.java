package topic3.polymorphism.HW1_10.music;

public class Song {
    private Track[] tracks;

    public Song (Track[] tracks){
        this.tracks=tracks;
    }
    public void playSong(){
        for (Track track : tracks) {
            track.play();
            System.out.println();
        }
    }

}
