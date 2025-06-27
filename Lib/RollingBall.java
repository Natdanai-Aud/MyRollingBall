package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{

    int x = 100;
    int y = 90;
    int start_angle = 0;
    int size = 80;
    public RollingBall(){
        Timer t = new Timer(50, this);
        t.start();
    }
    public void paintComponent(Graphics g) {
            
        super.paintComponent(g);
        g.drawOval(x, y, size, size);
        g.fillArc(x, y, size, size, start_angle, 180);
            
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            x -= 2 ;
            start_angle += 2 ;
            if(x<= -size) x = getWidth();
            if(start_angle >= 360) start_angle = 0;
            repaint();
    }
}
