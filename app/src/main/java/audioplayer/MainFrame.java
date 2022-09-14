package audioplayer;

import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
  MainFrame() {
    this.setTitle("AudioPlayer by Ekström");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(1200,800);
    this.setVisible(true);

    this.getContentPane().setBackground(new Color(0,0,0));
  }  
}
