package audioplayer;

import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame {
  JButton playButton;
  JButton pauseButton;
  JButton stopButton;
  MainFrame() {

    JLabel topLabel = new JLabel();
    topLabel.setText("Welcome to my AudioPlayer");
    topLabel.setBounds(400, 60, 400, 100);
    topLabel.setFont(new Font("Roboto UI",Font.BOLD,20));
    topLabel.setForeground(Color.white);


    topLabel.setBackground(Color.green);
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
    playButton.addActionListener((e) -> {System.out.println("play");});
    playButton.setText("Play");
    
    pauseButton = new JButton();
    pauseButton.setBounds(550, 100, 100, 33);
    pauseButton.addActionListener((e) -> {System.out.println("pause");});
    pauseButton.setText("Pause");

    stopButton = new JButton();
    stopButton.setBounds(650, 100, 100, 33);
    stopButton.addActionListener((e) -> {System.out.println("stop");});
    stopButton.setText("Stop");
    


    //this.add(redPanel);
    this.add(topLabel);
    this.add(playButton);
    this.add(pauseButton);
    this.add(stopButton);


  }

    
  
}
