import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyFrame extends JFrame
{
    public MyFrame() {
        this.setSize(300, 150);
        Container cp = this.getContentPane();
        this.setBackground(Color.lightGray);
        this.setTitle("프로그래밍 연습2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setDefaultLookAndFeelDecorated(true);
        
        
        
    }
}
