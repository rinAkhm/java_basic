package topic3.polymorphism.HW1_10.music;

import java.util.Random;

public class Main {
    static int LENGTH = 8;

    public static void main(String[] args) {
        Random random = new Random();
        Instrument[] instruments = new Instrument[LENGTH];
        for (int i = 0; i <LENGTH ; i++) {
            if (random.nextBoolean()){
                instruments[i]=new Guitar();
            }else {
                instruments[i]=new Instrument();
            }
        }
        Track guitarTrack = new Track(instruments);

        instruments = new Instrument[LENGTH];
        for (int i = 0; i <LENGTH ; i++) {
            if (random.nextBoolean()){
                instruments[i]=new Piano();
            }else {
                instruments[i]=new Instrument();
            }
        }
        Track pianoTrack = new Track(instruments);
        Song song=new Song(new Track[]{guitarTrack, pianoTrack});
        song.playSong();



    }
}


