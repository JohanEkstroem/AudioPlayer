package audioplayer;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Player {
    private Clip clip;

    Player() {

    }

    public void play() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (clip == null) {
            File file = new File("app/src/main/resources/level_up.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } else {
            clip.stop();
        }
        clip.start();
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            clip.setMicrosecondPosition(0);
        }
    }
    
    public void pause() {
        if(clip != null){
            clip.stop();
        }
    }

}
