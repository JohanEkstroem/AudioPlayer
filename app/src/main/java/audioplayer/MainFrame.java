package audioplayer;

import java.awt.*;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;


public class MainFrame extends JFrame {
  JButton playButton;
  JButton pauseButton;
  JButton stopButton;
  Player player = new Player();

  MainFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    JLabel topLabel = new JLabel();
    topLabel.setText("Welcome to my AudioPlayer");
    topLabel.setBounds(400, 60, 400, 100);
    topLabel.setFont(new Font("Roboto UI",Font.BOLD,20));
    topLabel.setForeground(Color.white);
    topLabel.setVerticalAlignment(JLabel.TOP);
    topLabel.setHorizontalAlignment(JLabel.CENTER);

    ImageIcon image = new ImageIcon("app/src/main/resources/image.png");
    this.setIconImage(image.getImage());
    this.setTitle("AudioPlayer by Ekström");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(1200,400);
    this.setLayout(null);
    this.getContentPane().setBackground(new Color(0,0,0));
    this.setVisible(true);


    playButton = new JButton();
    playButton.setBounds(450, 100, 100, 33);
    playButton.addActionListener((e) -> {System.out.println("play");try {
      player.play();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }});
    playButton.setText("Play");
    
    pauseButton = new JButton();
    pauseButton.setBounds(550, 100, 100, 33);
    pauseButton.addActionListener((e) -> {System.out.println("pause");});
    pauseButton.setText("Pause");

    stopButton = new JButton();
    stopButton.setBounds(650, 100, 100, 33);
    stopButton.addActionListener((e) -> {System.out.println("stop");player.stop();});
    stopButton.setText("Stop");
    
    this.add(topLabel);
    this.add(playButton);
    this.add(pauseButton);
    this.add(stopButton);
  }
    
  
}
