package TestGraphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShapes extends JPanel implements ActionListener{
    int x = 0;
    int y = 0;
    int height = 100, width = 100;
    Timer timer = new Timer(5,this);
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        y=getHeight()/2;
        g.setColor(Color.BLUE);
        g.fillRect(x - width / 2, y - height / 2, width, height);
        g.drawLine(0,y,getHeight(),y);
    }
    public void actionPerformed(ActionEvent e){
        x+=2;
        if(x>getWidth())
        x%=getWidth();
        repaint();

    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}

