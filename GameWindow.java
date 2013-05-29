import javax.swing.*;
import java.awt.*;

public class Editor {

public static boolean isRunning = false;

  public Game() {
  }
  public void init() {
  }
  public void start() {
  }
  public void stop() {
    isRunning = false;
  }
  public void run() {
    isRunning = true;
    
  }
  public static void main(String args[]) {
    Editor editor = new Editor();
    JFrame frame = new JFrame();
    frame.add(editor);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Space Game");
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  {
}
